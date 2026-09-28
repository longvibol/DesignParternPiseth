package com.pisethjava.proxy.integration;

public record PaymentResult(
		boolean success,
		String transactionId
		) {

}
