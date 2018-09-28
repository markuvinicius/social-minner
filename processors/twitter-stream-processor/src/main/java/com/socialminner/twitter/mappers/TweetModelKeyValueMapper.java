package com.socialminner.twitter.mappers;

import org.apache.kafka.streams.kstream.KeyValueMapper;

import com.socialminner.twitter.models.TweetModel;

import org.apache.kafka.streams.KeyValue;;

public class TweetModelKeyValueMapper implements KeyValueMapper<String, TweetModel, KeyValue<String, TweetModel>>{
	
	@Override
	public KeyValue<String, TweetModel> apply(String key, TweetModel value) {
		return new KeyValue<String, TweetModel>(value.getKey(), value);
	}
	
}
