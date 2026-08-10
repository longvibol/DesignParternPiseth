package com.pisethjava.observer.domain;

import java.time.LocalDateTime;

public class OrderCreatedEvent {

	private final String orderId;
    private final String customerEmail;
    private final String productName;
    private final int quantity;
    private final LocalDateTime createdAt;
    
	public OrderCreatedEvent(String orderId, String customerEmail, String productName, int quantity) {
		super();
		this.orderId = orderId;
		this.customerEmail = customerEmail;
		this.productName = productName;
		this.quantity = quantity;
		this.createdAt = LocalDateTime.now();
	}

	public String getOrderId() {
		return orderId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
    
    
    

}
