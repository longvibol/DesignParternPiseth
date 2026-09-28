package com.pisethjava.proxy.composition;

import com.pisethjava.proxy.integration.PaymentGateway;
import com.pisethjava.proxy.integration.PaymentRequest;
import com.pisethjava.proxy.integration.PaymentResult;

public class MetricsPaymentDecorator implements PaymentGateway {
	
	private final PaymentGateway target;
	
	public MetricsPaymentDecorator(PaymentGateway target) {
		this.target = target;
	}

	@Override
	public PaymentResult pay(PaymentRequest request) {
		long start = System.nanoTime();
		 try {
			 return target.pay(request);
		 }
		 finally {
			 System.out.println(
					 "Payment duration(ns): " + (System.nanoTime() - start)
					 );
		 }
	}

}
