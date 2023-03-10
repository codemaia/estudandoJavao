package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.DomainException;
import model.entities.Reservation;

public class ProgramReservation {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dt1 = "06/03/2023";
		String dt2 = "16/03/2023";
		
		LocalDate dtCheckIn = LocalDate.parse(dt1, fmt);
		LocalDate dtCheckOut = LocalDate.parse(dt2, fmt);
		
		
		Reservation reservation = new Reservation(8080, dtCheckIn, dtCheckOut);
		
		System.out.println(reservation + " | Days reservation: " + reservation.duration());
		
		
		System.out.println("Update reservation");
		
		String up1 = "08/03/2023";
		String up2 = "12/03/2023";
		
		LocalDate dtUp1 = LocalDate.parse(up1, fmt);
		LocalDate dtUp2 = LocalDate.parse(up2, fmt);
	
		reservation.updateDates(dtUp1, dtUp2);
		
		System.out.println("Updated: Check-In: " + reservation.getCheckIn() + " Check-out: " + reservation.getCheckOut());
		
		
		*/
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			
			System.out.println("**** RESERVATIONS ****");
			System.out.print("Room number: ");
			Integer roomNumber = sc.nextInt();
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			LocalDate checkIn = LocalDate.parse(sc.next(), fmt);
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			LocalDate checkOut = LocalDate.parse(sc.next(), fmt);
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			
			System.out.println(reservation);
		
			System.out.println();
			
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), fmt);
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = LocalDate.parse(sc.next(), fmt);
			
			reservation.updateDates(checkIn, checkOut);
			
			System.out.println(reservation);
		
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		

	}

}
