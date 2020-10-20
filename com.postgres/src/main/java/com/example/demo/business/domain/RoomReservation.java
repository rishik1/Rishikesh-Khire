package com.example.demo.business.domain;

import java.util.Date;

public class RoomReservation {
	
	private Long roomId;
	private long guestId;
	private String roomName;
	private String roomNumber;
	private String firstName;
	private String lastName;
	private Date dtae;
	

	public Long getRoomId() {
		return roomId;
	}
	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}
	public long getGuestId() {
		return guestId;
	}
	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDtae() {
		return dtae;
	}
	public void setDtae(Date dtae) {
		this.dtae = dtae;
	}

	

}