package com.pisethjava.observer.classes;

import com.pisethjava.observer.domain.OrderCreatedEvent;

public class EmailObserver implements OrderObserver {

	@Override
	public void onOrderCreated(OrderCreatedEvent event) {
		System.out.println(
                "[Email] Sending order confirmation for order " +
                event.getOrderId() +
                " to " +
                event.getCustomerEmail()
        );

	}

}
