package com.pisethjava.observer.classes;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.pisethjava.observer.domain.OrderCreatedEvent;

public class OrderPublisher {

	private final List<OrderObserver> observers = new CopyOnWriteArrayList<>();

	public void subscribe(OrderObserver observer) {
		if (observer != null) {
			observers.add(observer);
		}
	}

	public void unsubscribe(OrderObserver observer) {
		observers.remove(observer);
	}

	public void publish(OrderCreatedEvent event) {
		for (OrderObserver observer : observers) {
			try {
				observer.onOrderCreated(event);
			} catch (Exception exception) {
				System.err.println("Observer notification failed: " + exception.getMessage());
			}
		}
	}

}
