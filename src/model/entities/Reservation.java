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
		
		LocalDate now = LocalDate.now();
		
		if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
			
			System.out.println("Reservation dates for update must be future dates");
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
