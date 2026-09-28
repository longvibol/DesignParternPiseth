package com.pisethjava.proxy.integration;

public class AbaSdk {
	
	public String makePayment(double amount) {
		System.out.println("ABA SDK payment: " + amount);
		return "ABA-TX-001";
	}

}
