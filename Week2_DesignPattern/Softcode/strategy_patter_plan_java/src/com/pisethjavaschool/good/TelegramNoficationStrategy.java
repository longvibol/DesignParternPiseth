package com.pisethjavaschool.good;

import com.pisethjavaschool.model.NotificationRequest;

public class TelegramNoficationStrategy implements NotificationStrategy{

	// Select Channel
	@Override
	public NotificationChannel channel() {
		return NotificationChannel.TELEGRAM;
	}
	
	// Message
	@Override
	public String send(NotificationRequest request) {
		return "Send TELEGRAM to " + request.receiver() + ": " + request.message();
	}
}
