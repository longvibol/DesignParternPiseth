package com.pisethjavaschool.builder.lesson04_classic;

import java.math.BigDecimal;

public class ClassicBuilderDemo {

	public static void main(String[] args) {
		Room room = Room.builder()
				.roomCode("001")
				.roomName("001")
				.roomPrice(BigDecimal.valueOf(100))
				.roomWifi(true)
				.roomBalcony(false)
				.build();
		System.out.println(room);
	}
}