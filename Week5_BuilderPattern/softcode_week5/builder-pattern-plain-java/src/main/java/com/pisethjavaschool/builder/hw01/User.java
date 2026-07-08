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
	
	//Protect contact from outside
	private User() {
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder{
		private final User user = new User();
		
		public Builder roomId(String roomId) {
			user.id = roomId;
			return this;
		}
		
		public Builder roomFirstName(String roomFirstName) {
			user.firstName = roomFirstName;
			return this;
		}
		
		public Builder roomLastName(String roomLastName) {
			user.lastName = roomLastName;
			return this;
		}
		
		public Builder roomPhone(String roomPhone) {
			user.phone = roomPhone;
			return this;
		}
		
		public Builder roomEmail(String roomEmail) {
			user.email = roomEmail;
			return this;
		}
		
		public Builder roomGender(String roomGender) {
			user.gender = roomGender;
			return this;
		}
		
		public Builder roomBirthday(String roomBirthday) {
			user.birthday = roomBirthday;
			return this;
		}
		
		public Builder roomAddress(String roomAddress) {
			user.address = roomAddress;
			return this;
		}
		
		public Builder roomActive(Boolean roomActive) {
			user.active= roomActive;
			return this;
		}
		
		public Builder roomRole(String roomRole) {
			user.role= roomRole;
			return this;
		}
		
		public User build() {
			return user;
		}
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", email=" + email + ", gender=" + gender + ", birthday=" + birthday + ", address=" + address
				+ ", active=" + active + ", role=" + role + "]";
	}
		

}
