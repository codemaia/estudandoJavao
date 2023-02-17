package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
	
	private LocalDate moment;
	private String title;
	private String contente;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	
	public Post() {
		
	}


	public Post(LocalDate moment, String title, String contente, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.contente = contente;
		this.likes = likes;
	}


	public LocalDate getMoment() {
		return moment;
	}


	public void setMoment(LocalDate moment) {
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
	
}
