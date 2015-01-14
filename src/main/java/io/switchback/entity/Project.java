package io.switchback.entity;

import java.net.URI;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.URL;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Project {

	@GraphId
	private Long id;
	
	@NotNull
	@URL
	private URI uri;
}
