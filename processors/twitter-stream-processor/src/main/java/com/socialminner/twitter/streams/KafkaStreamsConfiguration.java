package com.socialminner.twitter.streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.streams.Consumed;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KeyValueMapper;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.kafka.streams.kstream.Reducer;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.annotation.KafkaStreamsDefaultConfiguration;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerde;
import com.socialminner.twitter.models.TweeterData;

import com.socialminner.twitter.models.TweeterData;
import com.socialminner.twitter.repository.Converter;
import com.socialminner.twitter.repository.TweetDeserializer;
import com.socialminner.twitter.repository.TweetSerializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
@EnableKafka
@EnableKafkaStreams
public class KafkaStreamsConfiguration {
	
	@Autowired 
	private KafkaProperties kafkaProperties;
	
	private static final Logger logger = LoggerFactory.getLogger(KafkaStreamsConfiguration.class);
	
	// TODO: the following can be removed with a serialization factory
    Map<String, Object> serdeProps = new HashMap<>();
	
	final Serializer<TweeterData> tweeterSerializer = new TweetSerializer<>();
	final Deserializer<TweeterData> tweeterDeserializer = new TweetDeserializer<>();
	
	final Serde<TweeterData> tweetSerDe = Serdes.serdeFrom(tweeterSerializer, tweeterDeserializer);
		
	
	@Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME)
    public StreamsConfig kStreamsConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "test-streams");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProperties.getBootstrapServers());
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, new JsonSerde<>(Test.class).getClass());
        //props.put(JsonDeserializer.DEFAULT_KEY_TYPE, String.class);
        //props.put(JsonDeserializer.DEFAULT_VALUE_TYPE, Test.class);
        return new StreamsConfig(props);
    }
	
    //@Bean
    public KStream<String, String> TestStream(StreamsBuilder builder) {
    	

        serdeProps.put("JsonPOJOClass", TweeterData.class);
        tweeterSerializer.configure(serdeProps, false);

        
        serdeProps.put("JsonPOJOClass", TweeterData.class);
        tweeterDeserializer.configure(serdeProps, false);
    		
    	
    	KStream<String, TweeterData> stream = builder.stream("bolsonaro", Consumed.with(Serdes.String(), tweetSerDe ));
    	
    	KStream<String, String> text = stream.mapValues( tweet -> tweet.getText());
    	
    	text.to("saida", Produced.with( Serdes.String(), Serdes.String() ));
    	
    	Runtime.getRuntime().addShutdownHook(new Thread(text::close));
    	
    	while (true) {
    		logger.info( stream.toString() );
    		try {
    			Thread.sleep(5000);
    		}catch (InterruptedException e) {
    			break;
    		}
    	}
    	    	    	        
        return text;
    }
    
    @Bean
    public KStream<String, TweeterData> TwitterStream(StreamsBuilder builder){
    	KStream<String,TweeterData> twitterInputStream = builder
    														.stream("bolsonaro" , 
    																Consumed.with( Serdes.String() , 
    																			   new JsonSerde<>(TweeterData.class)));    														
    	
    	twitterInputStream.print();
    	
    	while (true) {
    		logger.info( twitterInputStream.toString() );
    		try {
    			Thread.sleep(5000);
    		}catch (InterruptedException e) {
    			break;
    		}
    	}
    	
    	return twitterInputStream;
    	
    }
    
    public static class TweetValueMapper implements KeyValueMapper<String, String, KeyValue<String, TweeterData>>{

		@Override
		public KeyValue<String, TweeterData> apply(String key, String value) {
			
			TweeterData tweet = null;
			try {
				tweet = Converter.fromJsonString(value);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// TODO Auto-generated method stub
			return new KeyValue<String, TweeterData>( tweet.getIDStr() , tweet );
		}
    	
    }
    
    public static class TestKeyValueMapper implements KeyValueMapper<String, Test, KeyValue<String, Test>> {
		@Override
		public KeyValue<String, Test> apply(String key, Test value) {
			return new KeyValue<String, KafkaStreamsConfiguration.Test>(value.getKey(), value);
		}
		
    }
    
    public static class TestReducer implements Reducer<Test> {

		@Override
		public Test apply(Test value1, Test value2) {
			value1.getWords().addAll(value2.getWords());
			return value1;
		}
    	
    }
    
    
    public static class Test {
    	
    	private String key;
    	private List<String> words;
    	
    	public Test() {
    		words = new ArrayList<>();
    	}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public List<String> getWords() {
			return words;
		}

		public void setWords(List<String> words) {
			this.words = words;
		}
    	
    	
    	
    }
    
}