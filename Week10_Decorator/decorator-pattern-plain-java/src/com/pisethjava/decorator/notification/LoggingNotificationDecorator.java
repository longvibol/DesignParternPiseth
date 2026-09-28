package com.pisethjava.decorator.notification;

public final class LoggingNotificationDecorator extends NoficationDecorator{

	public LoggingNotificationDecorator(NotificationSender delegate) {
		super(delegate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String message) {

		System.out.println("[LOG] Sending notification");
		delegate.send(message);
		System.out.println("[LOG] Notification sent");
		
	}

}
