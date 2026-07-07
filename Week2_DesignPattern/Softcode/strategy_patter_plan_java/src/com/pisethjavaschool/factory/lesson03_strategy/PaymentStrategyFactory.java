package com.pisethjavaschool.factory.lesson03_strategy;

public class PaymentStrategyFactory {
	
	// create object from interface: this factory 
	public static PaymentStrategy getStrategy(String paymentMethod) {
		
		if ("ABA".equalsIgnoreCase(paymentMethod)) {
			// return concret class
			return new AbaPaymentStrategy();
		}
		
		if ("ACLEDA".equalsIgnoreCase(paymentMethod)) {
			return new AcledaPaymentStrategy();
		}
		
		throw new IllegalArgumentException("Unsupported payment method");
	}
}
