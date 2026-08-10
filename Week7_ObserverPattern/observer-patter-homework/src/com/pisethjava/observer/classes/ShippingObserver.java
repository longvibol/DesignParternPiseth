package com.pisethjava.observer.classes;

import com.pisethjava.observer.domain.OrderCreatedEvent;

public class ShippingObserver implements OrderObserver {

	@Override
	public void onOrderCreated(OrderCreatedEvent event) {
		 System.out.println(
	                "[Shipping] Preparing shipping process for order " +
	                event.getOrderId()
	        );
	}

}
