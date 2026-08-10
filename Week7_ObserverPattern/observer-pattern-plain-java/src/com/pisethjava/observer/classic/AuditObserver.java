package com.pisethjava.observer.classic;

public class AuditObserver implements UserObserver {

	@Override
	public void onUserRegistered(UserRegisteredEvent event) {
		System.out.println("AUDIT -> eventId= " + event.user().username());
	}

}
