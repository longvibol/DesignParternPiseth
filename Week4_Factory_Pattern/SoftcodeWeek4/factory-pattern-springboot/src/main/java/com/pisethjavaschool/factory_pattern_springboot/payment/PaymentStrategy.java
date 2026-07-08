package com.pisethjavaschool.factory_pattern_springboot.payment;

import java.math.BigDecimal;

public interface PaymentStrategy {
	void pay(BigDecimal amount);
}
