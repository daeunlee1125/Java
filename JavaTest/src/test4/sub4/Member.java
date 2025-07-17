package test4.sub4;

public class Member {
	private String name;
	private String memberId;
	private Book borrowedBook;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		borrowedBook = null;
	}
	
	public void borrowBook(Book borrowed) {
		if (borrowed.borrowBook()) {
			System.out.println(borrowed.getTitle() + " 이미 대출됨");
		}else {
			borrowedBook = borrowed;
			System.out.println("도서대출 : " + borrowed.getTitle());
		}
	}
	
	public void returnBook(Book returned) {
		if (returned.returnBook()) {
			borrowedBook = null;
			System.out.println("도서반납 : " + returned.getTitle());
		}else {
			System.out.println(returned.getTitle() + " 대출되지 않음");
		}
		
	}
	
	public void getMemberInfo() {
		System.out.println("회원명 : " + name);
		System.out.println("아이디 : " + memberId);
		if (borrowedBook==null) {
			System.out.println("대출한 도서 : 없음");
		}else {
			System.out.println("대출한 도서 : " + borrowedBook.getTitle());
		}
	}
}
