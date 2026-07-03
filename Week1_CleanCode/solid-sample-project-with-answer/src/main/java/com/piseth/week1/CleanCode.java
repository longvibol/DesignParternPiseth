package com.piseth.week1;

import java.math.BigDecimal;

public class CleanCode {

	public BigDecimal calculateDiscount(String customerType, BigDecimal amount) {
		if ("SILVER".equals(customerType)) {
			return amount.multiply(BigDecimal.valueOf(0.05));
		}
		if ("GOLD".equals(customerType)) {
			return amount.multiply(BigDecimal.valueOf(0.10));
		}
		if ("PLATINUM".equals(customerType)) {
			return amount.multiply(BigDecimal.valueOf(0.15));
		}
		return BigDecimal.ZERO;
	}

}
