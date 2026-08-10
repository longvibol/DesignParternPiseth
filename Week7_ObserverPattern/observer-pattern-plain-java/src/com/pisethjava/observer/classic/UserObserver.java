package com.pisethjava.observer.classic;

@FunctionalInterface
public interface UserObserver {
	void onUserRegistered(UserRegisteredEvent event);

}
