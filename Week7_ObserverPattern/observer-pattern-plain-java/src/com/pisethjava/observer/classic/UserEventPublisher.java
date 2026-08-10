package com.pisethjava.observer.classic;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserEventPublisher {
	// register observer
	private final List<UserObserver> observers = new CopyOnWriteArrayList<>();
	
	// CopyOnWriteArrayList<>() for thread safe 	
	public void subscribe(UserObserver observer) {
		if (observer == null) {
			throw new IllegalArgumentException("Observer is required");
		}
		observers.add(observer);
	}
	
	public void unsubscribe(UserObserver observer) {
		observers.remove(observer);
	}
	
	public void publish(UserRegisteredEvent event) {
		for (UserObserver observer : observers) {
			try {
				observer.onUserRegistered(event);
			} catch (RuntimeException exception) {
				System.out.printf("Observer %s failed: %s%n", 
						observer.getClass().getSimpleName(), exception.getMessage());
			}
		}
	}
	
	public int observerCount() {
		return observers.size();
	}

}
