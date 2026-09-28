package com.pisethjava.proxy.integration;

public class AbaPaymentAdapter implements PaymentGateway {
	
	private final AbaSdk abaSdk;
	
	public AbaPaymentAdapter(AbaSdk abaSdk) {
		this.abaSdk = abaSdk;
	}

	@Override
	public PaymentResult pay(PaymentRequest request) {
		
		String transactionId = 
				abaSdk.makePayment(
						request.amount().doubleValue());
		
		return new PaymentResult(true, "transactionId");
	}

}
