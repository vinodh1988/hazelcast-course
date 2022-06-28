package com.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

@SpringBootApplication
public class RestApiWithHazelcastLayerApplication {

	  @Bean
	  public HazelcastInstance getInstance() {
		  return Hazelcast.newHazelcastInstance();
	  }
	  

	public static void main(String[] args) {
		SpringApplication.run(RestApiWithHazelcastLayerApplication.class, args);
	}

}
