package com.pisethjava.observer.classes;

import com.pisethjava.observer.domain.OrderCreatedEvent;

public class InventoryObserver implements OrderObserver {

	@Override
	public void onOrderCreated(OrderCreatedEvent event) {
		System.out.println(
                "[Inventory] Reducing stock for " +
                event.getProductName() +
                " by " +
                event.getQuantity()
        );
	}
}
