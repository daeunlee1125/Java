package sub5;

/*
 * 날짜 : 2025/07/22
 * 이름 : 이다은
 * 내용 : 자바 Math 실습하기
 */
public class MathTest {
	public static void main(String[] args) {
		// Math 클래스는 static 메서드로 기능 제공
		// 객체 생성 못함! 그냥 쓰면 된당
		
		System.out.println("-5의 절대값 : " + Math.abs(-5));
		System.out.println("5의 절대값 : " + Math.abs(5));
		System.out.println("9의 제곱근 : " + Math.sqrt(9));
		System.out.println("16의 제곱근 : " + Math.sqrt(16));
		System.out.println("1.2의 올림값 : " + Math.ceil(1.2));
		System.out.println("1.8의 올림값 : " + Math.ceil(1.8));
		System.out.println("1.2의 내림값 : " + Math.floor(1.2));
		System.out.println("1.8의 내림값 : " + Math.floor(1.8));
		System.out.println("1.2의 반올림값 : " + Math.round(1.2));
		System.out.println("1.8의 반올림값 : " + Math.round(1.8));
		
		// Random
		double num1 = Math.random(); // 0에서 1 사이의 랜덤 실수 반환
		System.out.println("num1 : " + num1);
		
		double num2 = num1 * 10; // 0에서 10 사이의 랜덤 실수
		System.out.println("num2 : " + num2);
		
		double num3 = Math.ceil(num2); // 1에서 10 사이의 랜덤 정수
		System.out.println("num3 : " + num3);
		
		double rand = Math.ceil(Math.random()*10); // 위의 과정 한 줄 요약이죠?
		System.out.println("rand : " + rand);
		
		int lotto = (int) Math.ceil(Math.random()*46); // 1에서 46까지 로또번호
		System.out.println("lotto : " + lotto);
	}

}
