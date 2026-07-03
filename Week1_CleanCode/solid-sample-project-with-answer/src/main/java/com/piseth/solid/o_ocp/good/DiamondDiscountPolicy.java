package com.piseth.solid.o_ocp.good;

import java.math.BigDecimal;

public class DiamondDiscountPolicy implements DiscountPolicy {

    @Override
    public boolean supports(String membership) {
        return "DIAMOND".equals(membership);
    }

    @Override
    public BigDecimal calculate(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.02));
    }
}
