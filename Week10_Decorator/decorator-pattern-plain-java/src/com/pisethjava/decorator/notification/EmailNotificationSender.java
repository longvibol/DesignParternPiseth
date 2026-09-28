package com.pisethjava.decorator.notification;

public class EmailNotificationSender implements NotificationSender{

	@Override
	public void send(String message) {
		System.out.println("EMAIL: " + message);
		
	}



}
