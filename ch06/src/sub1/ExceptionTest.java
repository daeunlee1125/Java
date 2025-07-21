package sub1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 날짜 : 2025/07/21
 * 이름 : 이다은
 * 내용 : 자바 예외처리 실습하기
 */
public class ExceptionTest {
	public static void main(String[] args) {
		//---------------------------------------------//
		// 실행예외(Runtime) - 프로그램이 실행 중에 발생하는 에러 //
		//---------------------------------------------//
		
		// 예외1 - 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		
		try { // 예외 발생할 수 있는 코드
			
			int r1 = num1 + num2;
			int r2 = num1 - num2;
			int r3 = num1 * num2;
			int r4 = num1 / num2;
			
			System.out.println("r4 : "+r4);
			
		} catch (Exception e) { // 예외 발생했을 때 처리
			System.out.println("예외내용 : " + e.getMessage());
		}
		
		
		// 예외2 - 배열 인덱스 참조가 잘못됐을 때
		int[] arr = {1, 2, 3, 4, 5};
		try {
			for (int i = 0; i<=arr.length; i++) {
				System.out.println(arr[i]);
			}
		}catch(Exception e) {
			e.printStackTrace(); // 예외내용 콘솔 출력하고 계속 실행
		};
		
		// 예외3 - 객체 생성 없이 메서드 호출
		Animal animal = null; // 선언만 했죠?
		try {
			animal.move();		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// 예외4 - 잘못된 캐스팅
		Animal a1 = new Tiger(); //업캐스팅
		Animal a2 = new Eagle();
		
		try {
			Tiger tiger = (Tiger) a2; //잘못된 다운캐스팅. 이글을 타이거로 변환하려 함
		} catch(ClassCastException e) {
			e.printStackTrace();
		}
		
		//-----------------------------------------------------//
		// 일반예외(Compile-time) - 프로그램을 실행하기 전에 발생하는 에러 //
		//-----------------------------------------------------//
		
		// 동적 객체 생성
		try {
			Class cs = Class.forName("sub1.Tiger"); // 문자열 정보로 클래스 로드
			Constructor<?> constructor = cs.getDeclaredConstructor();
			Tiger tiger = (Tiger) constructor.newInstance();
			
			tiger.move();
			tiger.hunt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("프로그램 종료..."); //출력 안 되면 비정상종료죠?
	}
}
