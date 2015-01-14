package io.switchback.config;

import io.switchback.repositories.UserEventHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

	@Bean
	public UserEventHandler userEventHandler() {
		return new UserEventHandler();
	}
	
}
