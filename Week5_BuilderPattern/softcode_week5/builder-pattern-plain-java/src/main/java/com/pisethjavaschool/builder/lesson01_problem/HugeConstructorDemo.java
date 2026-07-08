package com.pisethjavaschool.builder.lesson01_problem;

import java.math.BigDecimal;

public class HugeConstructorDemo {

	public static void main(String[] args) {
		Room room = new Room("DLX001", "Delux Room", "DELUXE", 2, 1, BigDecimal.valueOf(80), "USD", true, false, true);
		
		System.out.println(room);

	}

}
