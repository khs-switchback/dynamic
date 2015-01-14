package io.switchback.repositories;

import io.switchback.entity.Organization;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="org", rel="org")
public interface OrganizationRepositories extends GraphRepository<Organization> {

	public Organization findByName(@Param("name") String name);

}
