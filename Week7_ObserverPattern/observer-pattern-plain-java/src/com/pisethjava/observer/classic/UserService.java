package com.pisethjava.observer.classic;

import com.pisethjava.observer.domain.User;

public class UserService {
	
	private final UserEventPublisher publisher;
	
	public UserService(UserEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public User register(User user) {
		System.out.println("SERVICE -> Save user " + user.username());
		
		// where we publish the user to ousite 
		publisher.publish(new UserRegisteredEvent(user));
		return user;
	}

}
