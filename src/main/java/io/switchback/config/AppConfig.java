package io.switchback.config;

import io.switchback.security.SwtichbackUserDetailsService;

import org.neo4j.graphdb.GraphDatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.core.env.Environment;
import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@ComponentScan("io.switchback")
@EnableSpringConfigured
@PropertySource({"classpath:db.properties"})
public class AppConfig {

	@Autowired
    private Environment env;
	
	@Bean
	public GraphDatabaseService graphDatabaseService() {
		return new SpringRestGraphDatabase( env.getProperty("db.url") + "/db/data/");
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new SwtichbackUserDetailsService();
	}
	
	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public LocalValidatorFactoryBean validator() {
		return new LocalValidatorFactoryBean();
	}
	
}
