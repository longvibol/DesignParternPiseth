package com.pisethjavaschool.builder.hw01;

public class User {
	
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String gender;
	private String birthday;
	private String address;
	private Boolean active;
	private String role;
	
	//  protech contact from outside
	private User() {
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder{
		private final User user = new User();
	}

}
