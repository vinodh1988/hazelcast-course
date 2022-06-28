package com.solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.topic.ITopic;

@Configuration
public class AppConfig {
	
@Autowired
HazelcastInstance instance;

  @Bean
  public ITopic<String> getTopic(){
	  return instance.getTopic("restapp");
  }
}
