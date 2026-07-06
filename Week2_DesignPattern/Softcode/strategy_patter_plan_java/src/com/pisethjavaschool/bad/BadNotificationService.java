package com.pisethjavaschool.bad;

import com.pisethjavaschool.model.NotificationRequest;

public class BadNotificationService {
	
	public static String send(String type, NotificationRequest request) {
		if("EMAIL".equalsIgnoreCase(type)) {
			return "Send EMAIL to " + request.receiver() + ": " + request.message();
		}
		
		if("SMS".equalsIgnoreCase(type)) {
			return "Send SMS to " + request.receiver() + ": " + request.message();
		}
		
		if("TELEGRAM".equalsIgnoreCase(type)) {
			return "Send TELEGRAM to " + request.receiver() + ": " + request.message();
		}
		
		throw new IllegalArgumentException("Unsupported notification type: " + type);
	}
}
