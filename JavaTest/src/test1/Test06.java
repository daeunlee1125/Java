package test1;
import java.util.Scanner;
/*
 * 날짜 : 2025/07/09
 * 이름 : 이다은
 * 내용 : 자바 기본 입출력 연습문제
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		
		String result = x>y?"x가 더 큽니다.":"y가 더 큽니다.";
		
		System.out.println(result);
		
		sc.close();
	}
}
