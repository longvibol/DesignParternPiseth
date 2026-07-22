package com.pisethjavaschool.builder.demolombok;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Room {
	private String roomCode;
	private String roomName;
	private BigDecimal price;
}
