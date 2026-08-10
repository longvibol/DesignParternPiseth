package com.pisethjava.observer.classic;

import java.time.Instant;
import java.util.UUID;

import com.pisethjava.observer.domain.User;

public record UserRegisteredEvent(UUID eventId, User user, Instant occurredAt) {

	public UserRegisteredEvent(User user) {
		this(UUID.randomUUID(), user, Instant.now());
	}
}
