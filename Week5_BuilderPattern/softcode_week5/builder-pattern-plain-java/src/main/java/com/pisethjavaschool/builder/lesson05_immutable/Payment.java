package com.pisethjavaschool.builder.lesson05_immutable;

import java.math.BigDecimal;
import java.util.UUID;

public class Payment {

	private final UUID id;
	private final BigDecimal amount;

	private Payment(Builder builder) {
		this.id = builder.id;
		this.amount = builder.amount;

	}

	public static class Builder {
		private UUID id;
		private BigDecimal amount;

		public Builder id(UUID id) {
			this.id = id;
			return this;
		}

		public Builder amount(BigDecimal amount) {
			this.amount = amount;
			return this;
		}

		public Payment build() {
			return new Payment(this);
		}
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", amount=" + amount + "]";
	}

}
