package com.pisethjavaschool.factory.lesson03_strategy;

import java.math.BigDecimal;

public class demostrategyandfactory {

	public static void main(String[] args) {

		
		PaymentService paymentService = new PaymentService(new PaymentStrategyFactory());
		
		paymentService.pay("ABA", new BigDecimal("10"));
		paymentService.pay("ACLEDA", new BigDecimal("500"));
		
	}

}
