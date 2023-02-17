package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime moment;
	private String title;
	private String contente;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	
	public Post() {
		
	}


	public Post(LocalDateTime moment, String title, String contente, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.contente = contente;
		this.likes = likes;
	}


	public LocalDateTime getMoment() {
		return moment;
	}


	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContente() {
		return contente;
	}


	public void setContente(String contente) {
		this.contente = contente;
	}


	public Integer getLikes() {
		return likes;
	}


	public void setLikes(Integer likes) {
		this.likes = likes;
	}


	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(title + "\n");
		sb.append(likes + " Likes - ");
		sb.append(formatter.format(moment) + "\n");
		sb.append(contente + "\n");
		sb.append("Comments: " + "\n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		
		
		return sb.toString();
	}
	
	
}
