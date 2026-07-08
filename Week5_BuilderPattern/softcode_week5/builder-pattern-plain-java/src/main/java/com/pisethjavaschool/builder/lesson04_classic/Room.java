package com.pisethjavaschool.builder.lesson04_classic;

import java.math.BigDecimal;
import java.util.Locale.Builder;

public class Room {

	private String roomCode;
	private String roomName;
	private BigDecimal price;
	private boolean wifi;
	private boolean balcony;

	private Room() {
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {

		private final Room room = new Room();

		public Builder roomCode(String roomCode) {
			room.roomCode = roomCode;
			return this;
		}

		public Builder roomName(String roomName) {
			room.roomName = roomName;
			return this;
		}

		public Builder roomPrice(BigDecimal price) {
			room.price = price;
			return this;
		}

		public Builder roomWifi(boolean wifi) {
			room.wifi = wifi;
			return this;
		}

		public Builder roomBalcony(boolean balcony) {
			room.balcony = balcony;
			return this;
		}

		public Room build() {
			return room;
		}
	}

	@Override
	public String toString() {
		return "Room [roomCode=" + roomCode + ", roomName=" + roomName + ", price=" + price + ", wifi=" + wifi
				+ ", balcony=" + balcony + "]";
	}
	
}
