package com.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RestApiWithCacheLayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiWithCacheLayerApplication.class, args);
	}

}
