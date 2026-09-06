package com.pisethjava.decorator.demo;

import com.pisethjava.decorator.notification.EmailNotificationSender;
import com.pisethjava.decorator.notification.EncryptionNotificationDecorator;
import com.pisethjava.decorator.notification.LoggingNotificationDecorator;
import com.pisethjava.decorator.notification.NotificationSender;
import com.pisethjava.decorator.notification.SmslNotificationSender;

public class BasicDecoratorDemo {
	
	public static void run() {
		System.out.println("\n=== 2. BASIC DECORATOR CHAIN ===	");
		
//		NotificationSender sender = new EmailNotificationSender();
//		NotificationSender sender = new LoggingNotificationDecorator(new EmailNotificationSender());
//		NotificationSender sender = new LoggingNotificationDecorator(new SmslNotificationSender());
//		NotificationSender sender = new EncryptionNotificationDecorator(new SmslNotificationSender());
		
		NotificationSender sender = new LoggingNotificationDecorator(
				new EncryptionNotificationDecorator(
						new SmslNotificationSender()));
		
		sender.send("Your booking is confirmed.");
	}

}
