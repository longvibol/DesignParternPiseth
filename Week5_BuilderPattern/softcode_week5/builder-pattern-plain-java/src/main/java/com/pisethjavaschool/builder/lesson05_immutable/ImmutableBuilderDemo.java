package com.pisethjavaschool.builder.lesson05_immutable;

import java.math.BigDecimal;
import java.util.UUID;

public class ImmutableBuilderDemo {

	public static void main(String[] args) {

		Payment payment = new Payment.Builder()
				.id(UUID.randomUUID())
				.amount(BigDecimal.valueOf(100))
				.build();

		System.out.println(payment.toString());
		System.out.println("Payment has final fields and no setters, so it cannot be changed after creation.");
		
	}

}
