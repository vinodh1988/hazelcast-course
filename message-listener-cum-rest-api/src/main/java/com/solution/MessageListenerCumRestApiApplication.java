package com.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

@SpringBootApplication
public class MessageListenerCumRestApiApplication {
	  @Bean
	  public HazelcastInstance getInstance() {
		  return HazelcastClient.newHazelcastClient();
	  }
	  

	public static void main(String[] args) {
		SpringApplication.run(MessageListenerCumRestApiApplication.class, args);
	}

}
