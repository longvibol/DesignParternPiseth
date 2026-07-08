package com.pisethjavaschool.factory_pattern_springboot.payment;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentService {

	private final PaymentStrategyFactory factory;

	public void pay(String method, BigDecimal amount) {
		PaymentStrategy strategy = factory.getStrategy(method);
		strategy.pay(amount);
	}

}
