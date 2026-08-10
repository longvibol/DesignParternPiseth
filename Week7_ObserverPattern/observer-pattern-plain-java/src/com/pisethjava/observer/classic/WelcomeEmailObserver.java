package com.pisethjava.observer.classic;

public class WelcomeEmailObserver implements UserObserver {

	@Override
	public void onUserRegistered(UserRegisteredEvent event) {
		System.out.println("EMAIL -> Welcome " + event.user().email());

	}

}
