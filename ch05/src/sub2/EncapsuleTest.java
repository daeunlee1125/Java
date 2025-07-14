package sub2;

/*
 * 날짜 : 2025/07/14
 * 이름 : 김철학
 * 내용 : 캡슐화 실습하기
 * 
 * 캡슐화 (정보 은닉, Encapsulation)
 *  - 객체의 속성을 외부에서 참조하지 못하게 은닉하는 특성
 *  - 클래스의 속성을 반드시 private로 선언
 *  - private 선언을 하면 생성자(Constructor)로 속성을 초기화
 *  - 은닉된 정보(속성)을 안전하게 사용하기 위해 Getter, Setter 메서드 사용
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소나타", "흰색", 0); //생성자 호출
		//은닉된 속성(멤버변수) : 생성자(Constructor)로 초기화
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반테", "검은색", 0);
		
		avante.speedUp(60);
		avante.speedDown(20);		
		//개별 속성이 은닉되어 있기 때문에 속성 수정 불가. Setter로 수정
		avante.setColor("남색");
		avante.show();
		
		//Account 객체 생성과 초기화(국민은행, 101-11-1001, 김유신, 10000)
		//출력 30000, 이름 김유신->김유진 수정
		Account kb = new Account("국민은행", "101-11-1001", "김유신", 10000);
		kb.deposit(20000);
		kb.show();
		
		kb.setname("김유진");
		kb.show();
		
		//Account 객체 생성과 초기화(우리은행, 101-21-2001, 김춘추, 30000)
		//출력 50000, 은행명 우리은행->너희은행 수정
		Account wr = new Account("우리은행", "101-21-2001", "김춘추", 30000);
		wr.deposit(30000);
		wr.withdraw(10000);
		wr.show();
		
		wr.setbank("너희은행");
		wr.show();
	}
}
