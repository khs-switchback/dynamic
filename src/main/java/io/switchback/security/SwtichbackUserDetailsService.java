package io.switchback.security;

import io.switchback.entity.User;
import io.switchback.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class SwtichbackUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository repository;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User account = repository.findByUsername(username);
		if(account != null) {
			SwitchbackUserDetails details = new SwitchbackUserDetails();
			details.setUsername(account.getUsername());
			details.setPassword("password");
			return details;
		}
		throw new UsernameNotFoundException("Username [" + username + "] not found.");
	}

}
