package test7.sub4;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<Article> articles;
	private List<User> users;
	
	public Board() {
		this.articles = new ArrayList<Article>();
		this.users = new ArrayList<User>();
	}
	
	public void addArticle(Article a) {
		articles.add(a);
	}
	public void addUser(User u) {
		users.add(u);
	}
	public List<Article> getArticles(){ return articles; }
	public List<User> getUsers() {return users;}
}
