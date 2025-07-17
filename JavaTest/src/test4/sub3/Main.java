package test4.sub3;

public class Main {
	public static void main(String[] args) {
		MovieTicket ticket = new MovieTicket("타이타닉", "19:00", "A1");
		
		//티켓 정보 출력
		ticket.printTicketInfo();
		System.out.println("--------------------");
		
		//티켓 예매
		ticket.bookTicket();
		System.out.println("--------------------");
		
		//좌석 예약 완료
		ticket.printTicketInfo();
		System.out.println("--------------------");
		
		//이미 예약된 좌석입니다!
		ticket.bookTicket();
		System.out.println("--------------------");
		
		//예매 취소
		ticket.cancleBooking();
		System.out.println("--------------------");
		
		//예매 가능한 좌석
		ticket.printTicketInfo();
		System.out.println("--------------------");
		
		//예매 안 된 상태입니다!
		ticket.cancleBooking();
		System.out.println("--------------------");
	}

}
