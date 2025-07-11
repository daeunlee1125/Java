package sub4;
/*
 * 날짜 : 2025/07/09
 * 이름 : 이다은
 * 내용 : 자바 메서드 오버로드(Overload) 실습하기
 */

//메서드 이름은 소문자로, 클래스 이름은 대문자로 시작
public class MethodOverloadTest {
	public static void main(String[] args) {
		int[] a = {2, 3, 4, 5, 6};
		add(a);
		int r2 = add(2, 3);
		double r3 = add(1.2, 3.14);
		String r4 = add("Hello", "Java");
		String r5 = add("number_", 1);
		
		System.out.println("r1 : "+a[4]);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		System.out.println("r5 : "+r5);
		
		
	}
	
	//오버로드 메서드 정의 : 메서드 이름은 같지만 매개변수로 구분되는 메서드
	public static void add(int[] a) {
		for (int num: a) {
			System.out.print(num + " ");
		}
	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static double add(double a, double b) {
		return a+b;
	}
	public static String add(String a, String b) {
		return a+b;
	}
	
	public static String add(String a, int b) {
		return a+b;
	}
}
