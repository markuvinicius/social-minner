package com.socialminner.twitter.repository;

import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.util.Map;

public class TweetSerializer<T> implements Serializer<T> {
	private final ObjectMapper objectMapper = new ObjectMapper();
    
    public TweetSerializer() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
		// TODO Auto-generated method stub		
	}

	@Override
	public byte[] serialize(String topic, T data) {
	    if (data == null)
	    	return null;

	    try {
	        return objectMapper.writeValueAsBytes(data);
	    } catch (Exception e) {
	        throw new SerializationException("Error serializing JSON message", e);
	    }
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
}
