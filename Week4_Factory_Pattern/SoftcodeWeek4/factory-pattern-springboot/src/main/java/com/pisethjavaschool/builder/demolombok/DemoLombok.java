package com.pisethjavaschool.builder.demolombok;

import java.math.BigDecimal;

public class DemoLombok {

	public static void main(String[] args) {
		Room room = Room.builder()
				.roomCode("A01")
				.roomName("Deluxe Room")
				.price(BigDecimal.valueOf(100))
				.build();
		
		System.out.println(room);

	}

}
