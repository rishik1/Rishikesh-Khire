package com.example.demo.domain.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.business.domain.RoomReservation;
import com.example.demo.data.entity.Reservation;
import com.example.demo.data.entity.Room;
import com.example.demo.data.repository.GuestRepository;
import com.example.demo.data.repository.ReservationRepository;
import com.example.demo.data.repository.RoomRepository;

@Service
public class ReservationService {
	private final RoomRepository roomRepository;
	private final GuestRepository guestRepository;
	private final ReservationRepository reservationRepository;
	
	
	public List<RoomReservation> getRoomReservationsForDate(RoomRepository roomRepository, GuestRepository guestRepository , ReservationRepository reservationRepository){
		Iterable<Room> rooms = this.roomRepository.findAll();
		Map<Long, RoomReservation> roomReservationMap = new HashMap();
		rooms.forEach(room -> {
			RoomReservation roomReservation = new RoomReservation();
			roomReservation.setRoomId(room.getRoomId());
			roomReservation.setRoomName(room.getRoomName());
			roomReservation.setRoomNumber(room.getRoomNumber());
			roomReservationMap.put(room.getRoomId(), roomReservation);

		});
		Iterable<Reservation> reservations = this.reservationRepository.findReservationByReservationDate(new java.sql.Date(date.getTime()));
		
		reservations.forEach(reservation ->{
			RoomReservation roomReservation = roomReservationMap.get(reservationMap.getGuestId()).get();
			roomReservation.setFirstName(guest.getFirstName());
			roomReservation.setLastName(guest.getLastName());
			roomReservation.setGuestId(guest.getGuestId());
		});
		
	return null;

}
