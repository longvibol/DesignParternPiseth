package com.pisethjava.proxy.integration;

public interface PaymentGateway {
	
	PaymentResult pay(PaymentRequest request);

}
