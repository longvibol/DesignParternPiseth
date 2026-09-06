package com.pisethjava.decorator.notification;

public final class EncryptionNotificationDecorator extends NoficationDecorator{

	public EncryptionNotificationDecorator(NotificationSender delegate) {
		super(delegate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String message) {
		delegate.send(encrypt(message));
		
	}
	
	private String encrypt(String message) {
		return "ENCRYPTED[" + message + "]";
	}

}
