package com.pisethjavaschool.builder.hw01;

public class ClassBuilderUserDemo {

	public static void main(String[] args) {
		User user = new User.Builder()
				.roomFirstName("Vibol")
				.roomLastName("Long")
				.roomId("001")
				.build();
		
		System.out.println(user);

	}

}
