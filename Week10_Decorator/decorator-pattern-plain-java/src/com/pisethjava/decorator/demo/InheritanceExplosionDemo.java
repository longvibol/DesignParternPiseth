package com.pisethjava.decorator.demo;

import com.pisethjava.decorator.inheritance.LoggedEmailNotificationSender;
import com.pisethjava.decorator.inheritance.LoggedEncryptedEmailNotificationSender;

public class InheritanceExplosionDemo {
	
	public static void run() {
		System.out.println("\n===1. Inheritance explosion ===");
		
		new LoggedEmailNotificationSender().send("Booking confirmed");
		new LoggedEncryptedEmailNotificationSender().send("Booking confirmed");
		
		System.out.println("Adding Retry, Metrics, Audit, and RateLimit would create...");
	}

}
