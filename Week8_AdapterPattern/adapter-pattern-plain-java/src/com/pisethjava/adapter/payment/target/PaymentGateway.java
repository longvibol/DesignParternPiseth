package com.pisethjava.adapter.payment.target;

import com.pisethjava.adapter.payment.domain.PaymentRequest;
import com.pisethjava.adapter.payment.domain.PaymentResult;

public interface PaymentGateway {
	
	PaymentResult pay(PaymentRequest request);

}
