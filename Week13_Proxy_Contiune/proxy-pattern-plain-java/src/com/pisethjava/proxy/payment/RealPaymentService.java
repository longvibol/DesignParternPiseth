package com.pisethjava.proxy.payment;

public class RealPaymentService implements PaymentService {

	@Override
	public PaymentResult pay(PaymentRequest request) {
		
		System.out.println(
				"Processing payment: " + request.amount()
				);
		
		return new PaymentResult(
				true, 
				"PAYMENT-001");
	}

}
