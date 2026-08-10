package com.pisethjava.observer.classes;

import com.pisethjava.observer.domain.OrderCreatedEvent;

public class OrderService {
    private final OrderPublisher orderPublisher;

    public OrderService(OrderPublisher orderPublisher) {
        this.orderPublisher = orderPublisher;
    }

    public void createOrder(
            String orderId,
            String customerEmail,
            String productName,
            int quantity) {

        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "Order quantity must be greater than zero."
            );
        }

        System.out.println("Creating order: " + orderId);

        // The order would normally be saved to a database here.

        OrderCreatedEvent event = new OrderCreatedEvent(
                orderId,
                customerEmail,
                productName,
                quantity
        );
        orderPublisher.publish(event);
    }
}
