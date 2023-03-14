package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
	
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reservation() {
		
	}


	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
		
		if (checkIn.isAfter(checkOut)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public LocalDate getCheckIn() {
		return checkIn;
	}


	public LocalDate getCheckOut() {
		return checkOut;
	}

	
	public Integer duration() {
		Integer diff = checkOut.getDayOfMonth() - checkIn.getDayOfMonth();
		return diff;
	}

	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
		
		
		if (checkIn.isBefore(getCheckIn()) || checkOut.isBefore(getCheckOut())) {
			throw new DomainException("Error in reservation: Reservation dates for update must be future dates");
		}
		
			
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Reservation: Room " 
				+ roomNumber
				+ ", check-in: " 
				+ fmt.format(checkIn) 
				+ ", check-out: " 
				+ fmt.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
	
	
	

	
	
}
