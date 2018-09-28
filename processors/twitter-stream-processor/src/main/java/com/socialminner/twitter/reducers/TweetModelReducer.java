package com.socialminner.twitter.reducers;

import org.apache.kafka.streams.kstream.Reducer;

import com.socialminner.twitter.models.TweetModel;

public class TweetModelReducer implements Reducer<TweetModel> {

	@Override
	public TweetModel apply(TweetModel value1, TweetModel value2) {
		value1.getWords().addAll( value2.getWords() );
		return value1;
	}

}
