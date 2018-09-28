package com.socialminner.twitter.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.socialminner.twitter.streams")
public class TwitterStreamProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterStreamProcessorApplication.class, args);
	}
}
