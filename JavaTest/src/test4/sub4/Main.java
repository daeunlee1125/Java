package test4.sub4;

public class Main {
	public static void main(String[] args) {
		Book book = new Book("자바 프로그래밍", "제임스 고슬링", "101-1234-1001");
		
		Member member = new Member("홍길동", "A001");
		
		// 책 정보 출력
		book.getBookInfo();
		System.out.println("--------------------");
		
		// 책 대여하기
		member.borrowBook(book);
		System.out.println("--------------------");
		
		// 책 정보 출력 - 예약된 도서
		book.getBookInfo();
		System.out.println("--------------------");
		
		// 회원 정보 출력
		member.getMemberInfo();
		System.out.println("--------------------");
		
		// 대출중인 책입니다!
		member.borrowBook(book);
		System.out.println("--------------------");
		
		// 도서 반납
		member.returnBook(book);
		System.out.println("--------------------");
		
		// 회원 정보 출력 - 현재 대출중인 도서 없음
		member.getMemberInfo();
		System.out.println("--------------------");
	}
}
