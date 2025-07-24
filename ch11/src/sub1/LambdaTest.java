package sub1;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 람다식 실습하기
 */

// 람다식으로 구현할 인터페이스는 추상 메서드를 하나만 가질 수 있다!
@FunctionalInterface
interface A {
	public int method(int a, int b);
}

@FunctionalInterface
interface B {
	public void method(double a);
}

@FunctionalInterface
interface C {
	public boolean method();
}

@FunctionalInterface
interface D {
	public void method();
}

@FunctionalInterface
interface E {
	public double method(double num); 
}

public class LambdaTest {
	public static void main(String[] args) {
		
		// A 인터페이스 람다식 정의
		A a1 = (int a, int b) -> {
			int c = a+b;
			return c;
		}; // 요게 인터페이스를 구현한 람다식임!
		
		A a2 = (a, b) -> {
			return a+b;
		};
		
		// 가장 극단적으로 요약한 람다식! {중괄호} 생략은 return
		A a3 = (a, b) -> a + b;
		
		// 람다식 호출
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 2);
		int r3 = a3.method(3, 4);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		
		
		// B 인터페이스 람다식 정의
		B b1 = (double a) -> {
			System.out.println("b1_a : " + a);
		};
		
		B b2 = a -> System.out.println("b2_a : " + a);
		
		B b3 = System.out::println; // 메서드 참조 연산자 :: 사용. (이 식도 람다식임!)
		
		b1.method(1);
		b2.method(2);
		b3.method(3); // 그냥 b3의 매개변수가 그대로 출력된당
		
		// C 인터페이스 람다식 정의
		C c1 = () -> {return true;};
		
		C c2 = () -> false;
		
		boolean br1 = c1.method();
		boolean br2 = c2.method();
		
		System.out.println("br1 : " + br1);
		System.out.println("br2 : " + br2);
		
		// D 인터페이스 람다식 정의
		D d1 = () -> {
			System.out.println("d1 실행...");
		};
		
		D d2 = () -> System.out.println("d2 실행...");
		
		d1.method();
		d2.method();
		
		// E 인터페이스 람다식 정의
		E e1 = Math::ceil; // 메서드 참조 연산자 :: 사용했죠?
		E e2 = Math::floor;
		E e3 = Math::round;
		
		double num1 = e1.method(1.2);
		double num2 = e2.method(1.2);
		double num3 = e3.method(1.2);
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		// 람다식을 이용한 스레드
		Runnable run = () -> {
			for (int i = 0; i<10; i++) {
				System.out.println("Run... : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread tr = new Thread(run);
		tr.start();
		
		// Runnable 인터페이스의 람다식을 그냥 생성자에 통으로 넣어버림
		Thread tr2 = new Thread(() -> {
			for (int i = 0; i<10; i++) {
				System.out.println("RunTR2... : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		tr2.start();
		
	}
}
