package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class ProgramPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!"); 
		
		Post p1 = new Post(
							LocalDateTime.parse("21/06/2018 13:05:44", formatter), 
							"Traveling to New Zealand",
							"I'm going to visit this wonderful country!",
							12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		
		
		
		sc.close();
	}

}
