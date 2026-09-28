package com.pisethjava.proxy.payment;

import com.pisethjava.proxy.document.CurrentUser;

public class PaymentSecurityProxy implements PaymentService {
	
	private final PaymentService target;
	private final CurrentUser currentUser;
	
	public PaymentSecurityProxy(PaymentService target, CurrentUser currentUser) {
		this.target = target;
		this.currentUser = currentUser;
	};

	@Override
	public PaymentResult pay(PaymentRequest request) {
		
		if(!currentUser.permissions().contains("PAYMENT_CREATE")) {
			throw new SecurityException(
					"PAYMENT_CREATE permission required");
		}
		
		return target.pay(request);
	}

}
