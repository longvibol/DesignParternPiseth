package com.pisethjava.adapter.payment.adapter;

import com.pisethjava.adapter.payment.domain.PaymentRequest;
import com.pisethjava.adapter.payment.domain.PaymentResult;
import com.pisethjava.adapter.payment.domain.PaymentStatus;
import com.pisethjava.adapter.payment.external.wing.WingMoneyClient;
import com.pisethjava.adapter.payment.external.wing.WingReply;
import com.pisethjava.adapter.payment.target.PaymentGateway;

public class WingPaymentAdapter implements PaymentGateway {
	
	private final WingMoneyClient client;

	public WingPaymentAdapter(WingMoneyClient client) {
		this.client = client;
	}


	@Override
	public PaymentResult pay(PaymentRequest r) {
		WingReply x = client.transfter(r.account(), r.amount(), r.reference());
		return new PaymentResult(x.transcationReference(), x.code() == 0 ? PaymentStatus.SUCCESS: PaymentStatus.FAILED, x.text());
	}

}
