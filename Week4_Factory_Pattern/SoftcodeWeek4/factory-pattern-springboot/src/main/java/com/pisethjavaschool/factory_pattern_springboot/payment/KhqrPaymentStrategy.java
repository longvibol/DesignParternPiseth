package com.pisethjavaschool.factory_pattern_springboot.payment;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;


@Component("KHQR")
public class KhqrPaymentStrategy implements PaymentStrategy {

	@Override
	public void pay(BigDecimal amount) {
		System.out.println("Pay by KHQR");

	}

}
