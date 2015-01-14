package io.switchback.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableNeo4jRepositories(basePackages = "io.switchback.repositories")
public class DatabaseConfig extends Neo4jConfiguration {
	
	@Autowired
    private Environment env;
	
	DatabaseConfig() {
        setBasePackage("io.switchback.entity");
    }

}
