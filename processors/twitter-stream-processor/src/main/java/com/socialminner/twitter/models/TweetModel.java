package com.socialminner.twitter.models;

import java.io.Serializable;
import java.util.ArrayList;

//@Data
public class TweetModel implements Serializable{	
    	
	private static final long serialVersionUID = 1L;
	
	private String key;
	private String message;
	private ArrayList<String> words;
	
	public TweetModel() {
		key = new String();
		message = new String();
		words = new ArrayList<String>();
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<String> getWords() {
		return words;
	}

	public void setWords(ArrayList<String> words) {
		this.words = words;
	}    	    
	
	
    

}
