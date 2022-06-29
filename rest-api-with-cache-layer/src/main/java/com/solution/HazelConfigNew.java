package com.solution;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;

@Configuration
public class HazelConfigNew {
   
	@Bean
	public Config hazelConfig() {
		return new Config()
				.addMapConfig(
						 new MapConfig()
						 .setName("messages")
						);
				
	}
}
