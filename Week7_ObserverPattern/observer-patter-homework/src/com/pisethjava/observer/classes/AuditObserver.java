package com.pisethjava.observer.classes;

import com.pisethjava.observer.domain.OrderCreatedEvent;

public class AuditObserver implements OrderObserver {

	@Override
	public void onOrderCreated(OrderCreatedEvent event) {
		System.out.println(
                "[Audit] Order " +
                event.getOrderId() +
                " was created at " +
                event.getCreatedAt()
        );

	}

}
