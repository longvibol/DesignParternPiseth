package com.pisethjavaschool.good;

import com.pisethjavaschool.model.NotificationRequest;

public class SmsNoficationStrategy implements NotificationStrategy{

	// Select Channel
	@Override
	public NotificationChannel channel() {
		return NotificationChannel.SMS;
	}
	
	// Message
	@Override
	public String send(NotificationRequest request) {
		return "Send SMS to " + request.receiver() + ": " + request.message();
	}
}
