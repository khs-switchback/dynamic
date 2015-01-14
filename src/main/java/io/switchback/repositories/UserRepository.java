package io.switchback.repositories;

import io.switchback.entity.User;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="user", rel="user")
public interface UserRepository extends GraphRepository<User> {

	User findByUsername(@Param("0") String username);
	
}
