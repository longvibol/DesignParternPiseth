package com.pisethjavaschool.factory_pattern_springboot.payment;

import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentStrategyFactory {

	private final Map<String, PaymentStrategy> strategies;

	public PaymentStrategy getStrategy(String method) {
		PaymentStrategy strategy = strategies.get(method);
		
		if (strategy == null) {
			
			throw new IllegalArgumentException("Unsupported payment method");
		}
			return strategy;
	}
}
