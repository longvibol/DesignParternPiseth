package com.pisethjava.observer.classes;

import com.pisethjava.observer.domain.OrderCreatedEvent;

public class SmsObserver implements OrderObserver {

	@Override
	public void onOrderCreated(OrderCreatedEvent event) {
		System.out.println(
                "[SMS] Sending SMS notification for order " +
                event.getOrderId()
        );
	}

}
