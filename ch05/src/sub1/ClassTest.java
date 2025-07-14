package sub1;

/*
 * 날짜 : 2025/07/14
 * 이름 : 김철학
 * 내용 : 자바 객체지향 프로그래밍 클래스 실습
 * 
 * 스택(Stack)
 *  - 자바의 일반변수, 참조변수, 지역변수가 push되어 저장되는 메모리 영역
 *  - 해당 메서드 영역 및 프로그램이 종료되면 pop되어 메모리에서 제거
 *  - 객체(참조변수)는 스택에서 Heap 메모리 공간의 객체 인스턴스 참조(주소값 저장)
 *  
 * 힙(Heap)
 *  - 자바의 객체가 생성되는 메모리 공간
 *  - 스택처럼 순서대로 쌓이지 않고 랜덤으로 메모리 공간에 생성
 *  - 참조변수가 제거되어 더 이상 참조되지 않으면 Garbage Collector로 해제됨
 *  
 */
public class ClassTest {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 객체 생성 (인스턴스화)
		Car sonata = new Car(); // 참조타입이 Car인 객체 sonata죠?
		//stack에 sonata, heap에 Car(클래스)가 생성된다!
		//stack에 있는 포인터가 Heap에 있는 인스턴스를 참조함
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 상호작용 (기능 활용)
		sonata.speedUp(80);
		sonata.speedDown(10);
		sonata.show();
		
		
		// 객체 생성, 초기화, 상호작용
		Car avante = null; //선언(declare)할 때는 일반적으로 null로 초기화
		avante = new Car(); //생성 (메모리 주소값 부여되고 새로운 인스턴스 Car을 참조하겟죵)
		
		avante.name = "아반테"; //초기화(initialize) : 변수에 최초로 값을 대입
		avante.color = "검정색";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show();
		
		
		/*
		 * 은행계좌 객체 생성
		 * 은행명 : 국민은행(kb)
		 * 계좌번호 : 101-11-1001
		 * 입금주 : 김유신
		 * 현재잔액 : 0
		 */
		//은행계좌 객체 생성
		Account kb = new Account();
		
		kb.bank = "국민은행";
		kb.id = "101-11-1001";
		kb.name = "김유신";
		kb.balance = 0;
		
		kb.deposit(100000);
		kb.withdraw(30000);
		
		kb.show();
		
		/*
		 * 은행계좌 객체 생성
		 * 은행명 : 우리은행(wr)
		 * 계좌번호 : 101-21-2001
		 * 입금주 : 김춘추
		 * 현재잔액 : 10000
		 */
		//은행계좌 객체 생성
		Account wr = new Account();
		
		wr.bank = "우리은행";
		wr.id = "101-21-2001";
		wr.name = "김유신";
		wr.balance = 10000;
		
		wr.deposit(20000);
		wr.withdraw(5000);
		
		wr.show();
		
		
		/*메인 끝날 때 Garbage collector가 
		 * Stack pop하고
		 * 이제 쓸모없는 인스턴스들 정리해줌
		 */
	}
}
