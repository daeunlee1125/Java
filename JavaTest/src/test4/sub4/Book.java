package test4.sub4;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowed;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowed = false;
	}
	
	public boolean borrowBook() {
		if (isBorrowed==false) {
			isBorrowed = true;
			return false;
		}else {
			return true;
		}
	}
	
	public boolean returnBook() {
		if (isBorrowed==true) {
			isBorrowed = false;
			return true;
		}else {
			return false;
		}
	}
	
	public void getBookInfo() {
		System.out.println("도서명 : "+title);
		System.out.println("저자 : "+author);
		System.out.println("ISBN : "+isbn);
		System.out.println("대출 여부 : "+(isBorrowed?"불가능":"가능"));
		
	}
	
	public String getTitle() {
		return title;
	}
}
