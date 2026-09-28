package com.pisethjava.proxy.integration;

import java.util.Set;

public class SecuredPaymentGatewayProxy implements PaymentGateway {
	
	private final PaymentGateway target;
	private final Set<String> permissions;
	
	public SecuredPaymentGatewayProxy(
			PaymentGateway target, 
			Set<String> permissions) {
		this.target = target;
		this.permissions = permissions;
	}

	@Override
	public PaymentResult pay(PaymentRequest request) {
		if (!permissions.contains("PAYMENT_CREATE")) {
			throw new SecurityException(
					"PAYMENT_CREATE permission required"
					);
		}
		System.out.println("Payment permission passed");
		
		return target.pay(request);
	}

}
