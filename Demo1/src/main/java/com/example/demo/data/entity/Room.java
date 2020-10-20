package com.example.demo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")
public class Room {

	@Id
	@Column(name="ROOM_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long rommId;
	
	@Column(name="NAME")
	private String romName;
	
	@Column(name="ROOM_NUMBER")
	private String roomNumber;
	
	@Column(name="BED_INFO")
	private String bedInfo;
	
	
	
	public Long getRommId() {
		return rommId;
	}

	public void setRommId(Long rommId) {
		this.rommId = rommId;
	}

	public String getRomName() {
		return romName;
	}

	public void setRomName(String romName) {
		this.romName = romName;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getBedInfo() {
		return bedInfo;
	}

	public void setBedInfo(String bedInfo) {
		this.bedInfo = bedInfo;
	}

	
	

	
	
	
	
	
}
