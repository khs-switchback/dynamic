package io.switchback.repositories;

import io.switchback.AccountType;
import io.switchback.entity.User;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

@RepositoryEventHandler(User.class)
public class UserEventHandler {

	@HandleBeforeCreate
	public void beforeCreate(User user) {
		user.setAccountType(AccountType.FREE);
	}
	
}
