package com.pisethjavaschool.factory.lesson03_strategy;

import java.math.BigDecimal;

public class PaymentService {

	// Inject the paymentStrategy
	private final PaymentStrategyFactory factory;

	public PaymentService(PaymentStrategyFactory factory) {
		this.factory = factory;
	}

	public void pay(String paymentMethod, BigDecimal amount) {
		PaymentStrategy strategy = factory.getStrategy(paymentMethod);
		strategy.pay(amount);
	}

}
