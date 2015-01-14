package io.switchback.repositories;

import io.switchback.AccountType;
import io.switchback.entity.Organization;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

@RepositoryEventHandler(Organization.class)
public class OrganizationEvenHandler {

	@HandleBeforeCreate
	public void beforeCreate(Organization organization) {
		organization.setAccountType(AccountType.FREE);
	}
	
}
