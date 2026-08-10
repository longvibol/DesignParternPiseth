package com.pisethjava.observer.classes;

import com.pisethjava.observer.domain.OrderCreatedEvent;

@FunctionalInterface
public interface OrderObserver {

	void onOrderCreated(OrderCreatedEvent event);
	
}
