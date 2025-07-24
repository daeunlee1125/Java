package test7.sub4;

import java.util.ArrayList;
import java.util.List;

public class Article implements Commentable {
	private String no;
	private String title;
	private String content;
	private User user;
	private List<Comment> comments;
	public Article(int no, String title, String content, User user) {
		super();
		this.no = no+"";
		this.title = title;
		this.content = content;
		this.user = user;
		this.comments = new ArrayList<Comment>();
	}
	
	public String getNo() {return no;}
	public String getTitle() {return title;}
	public String getContent() { return content; }
	public User getUser() { return user;}
	public List<Comment> getComments() {return comments;}
	public void addComment(Comment c) {
		comments.add(c);
	}
	
}
