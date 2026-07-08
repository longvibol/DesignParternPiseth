package com.pisethjavaschool.good;

import com.pisethjavaschool.model.NotificationRequest;

public class EmailNoficationStrategy implements NotificationStrategy{

	// Select Channel
	@Override
	public NotificationChannel channel() {
		return NotificationChannel.EMAIL;
	}
	
	// Message
	@Override
	public String send(NotificationRequest request) {
		return "Send EMAIL to " + request.receiver() + ": " + request.message();
	}
}
