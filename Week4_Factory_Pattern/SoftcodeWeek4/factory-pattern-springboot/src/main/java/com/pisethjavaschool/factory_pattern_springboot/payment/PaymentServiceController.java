package com.pisethjavaschool.factory_pattern_springboot.payment;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PaymentServiceController {
	
	private final PaymentService paymentService;

    @GetMapping("/pay")
    public String pay(
            @RequestParam String method,
            @RequestParam BigDecimal amount
    ) {
        paymentService.pay(method, amount);
        return "Payment success with method: " + method + ", amount: " + amount;
    }

}
