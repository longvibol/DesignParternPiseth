package com.pisethjava.decorator.notification;

import java.util.Objects;

public abstract class NoficationDecorator implements NotificationSender {
	
	protected final NotificationSender delegate;
	

	protected NoficationDecorator(NotificationSender delegate) {
		this.delegate = Objects.requireNonNull(delegate, "delegate is requried");
				
	}

}
