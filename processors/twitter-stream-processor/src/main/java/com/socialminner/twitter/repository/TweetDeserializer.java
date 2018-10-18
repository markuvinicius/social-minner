package com.socialminner.twitter.repository;

import java.util.Map;

import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TweetDeserializer<T> implements Deserializer<T> {
	
    private ObjectMapper objectMapper = new ObjectMapper();
	
	private Class<T> tClass;

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
		this.tClass = (Class<T>) configs.get("TweeterData");
		// TODO Auto-generated method stub
		
	}

	@Override
	public T deserialize(String topic, byte[] data) {
		if (data == null)
            return null;

        T dados;
        try {
            dados = objectMapper.readValue(data, tClass);
        } catch (Exception e) {
            throw new SerializationException(e);
        }

        return dados;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
