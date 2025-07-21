package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜 : 2025/07/21
 * 이름 : 이다은
 * 내용 : 자바 예외 던지기 실습하기
 */
public class ThrowsTest {
	public static void main(String[] args) {
		try {
			method1(7);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
	}
	
	public static void method1(int n) throws Exception { // 떠맡은 예외들 또 상위 클래스로 던짐
		
		method2(n);
	}
	
	// Exception 두 가지를, method2를 호출한 곳에서 예외처리하도록 던짐
	public static void method2(int n) throws InputMismatchException, ArithmeticException {
		Scanner sc = new Scanner(System.in);
		System.out.print("값 입력 : " );
		
		int value = sc.nextInt(); // InputMismatchException 발생
		int result = n/value; //Arithmetic exception 발생
		
		System.out.println("result : " + result);
	}
}
