package com.pisethjava.adapter.demo;

import java.math.BigDecimal;

import com.pisethjava.adapter.payment.adapter.AbaPaymentAdapter;
import com.pisethjava.adapter.payment.adapter.WingPaymentAdapter;
import com.pisethjava.adapter.payment.domain.PaymentRequest;
import com.pisethjava.adapter.payment.external.aba.AbaPaymentSdk;
import com.pisethjava.adapter.payment.external.wing.WingMoneyClient;
import com.pisethjava.adapter.payment.service.PaymentService;
import com.pisethjava.adapter.payment.target.PaymentGateway;

public class ObjectAdapterDemo {
	
	public static void run() {
		System.err.println("\n2. OBJECT ADAPTER");
		
//		PaymentGateway gateway = new AbaPaymentAdapter(new AbaPaymentSdk());		
		PaymentGateway gateway = new WingPaymentAdapter(new WingMoneyClient());
		PaymentService service = new PaymentService(gateway);
		
		System.out.println(
				service.checkout(new PaymentRequest("001-123", new BigDecimal("125.50"), "USD", "ABB Payment"))
				);
	}

}
