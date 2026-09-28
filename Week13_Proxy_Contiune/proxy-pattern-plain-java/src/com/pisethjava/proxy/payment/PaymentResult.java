package com.pisethjava.proxy.payment;

public record PaymentResult(
		boolean success, 
		String transactionId) {
}