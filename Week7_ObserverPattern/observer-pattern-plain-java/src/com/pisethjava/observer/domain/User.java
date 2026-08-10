package com.pisethjava.observer.domain;

public record User(String username, String email, String phone) {
	public User {
		if(username == null || username.isBlank()) {
			throw new IllegalArgumentException("Username is required");
		}
		
		if(email == null || email.isBlank()) {
			throw new IllegalArgumentException("Email is required");
		}
	}
}
