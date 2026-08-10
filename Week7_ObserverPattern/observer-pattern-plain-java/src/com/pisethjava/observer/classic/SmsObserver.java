package com.pisethjava.observer.classic;

public class SmsObserver implements UserObserver {

	@Override
	public void onUserRegistered(UserRegisteredEvent event) {
		System.out.println("SMS -> Send message to " + event.user().phone());

	}

}
