package com.pisethjava.adapter.payment.adapter;

import com.pisethjava.adapter.payment.domain.PaymentRequest;
import com.pisethjava.adapter.payment.domain.PaymentResult;
import com.pisethjava.adapter.payment.domain.PaymentStatus;
import com.pisethjava.adapter.payment.external.aba.AbaPaymentSdk;
import com.pisethjava.adapter.payment.external.aba.AbaResponse;
import com.pisethjava.adapter.payment.target.PaymentGateway;

public class AbaPaymentAdapter implements PaymentGateway {
	
	private final AbaPaymentSdk sdk;	

	public AbaPaymentAdapter(AbaPaymentSdk sdk) {
		this.sdk = sdk;
	}

	@Override
	public PaymentResult pay(PaymentRequest r) {
		AbaResponse x = sdk.submitPayment(r.account(), r.amount().doubleValue(), r.currency(), r.reference());
		
		PaymentStatus s = switch (x.status()) {
		case APPROVED -> PaymentStatus.SUCCESS;
		case DECLINED -> PaymentStatus.FAILED;
		case PROCESSING -> PaymentStatus.PENDING;
		};		
		
		return new PaymentResult(x.transactionCode(), s, x.description());
	}

}
