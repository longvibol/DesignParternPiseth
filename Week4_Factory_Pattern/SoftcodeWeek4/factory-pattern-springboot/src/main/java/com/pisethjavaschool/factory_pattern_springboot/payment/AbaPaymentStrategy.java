package com.pisethjavaschool.factory_pattern_springboot.payment;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component("ABA")
public class AbaPaymentStrategy implements PaymentStrategy {

	@Override
	public void pay(BigDecimal amount) {
		System.out.println("Pay by ABA");

	}

}
