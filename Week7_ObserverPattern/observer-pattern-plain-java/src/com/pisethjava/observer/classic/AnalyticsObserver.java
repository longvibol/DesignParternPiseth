package com.pisethjava.observer.classic;

public class AnalyticsObserver implements UserObserver {

	@Override
	public void onUserRegistered(UserRegisteredEvent event) {
		System.out.println("METRIC -> Increment user.registration.count");

	}

}
