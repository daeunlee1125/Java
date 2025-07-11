package test1;
/*
 * 날짜 : 2025/07/09
 * 이름 : 이다은
 * 내용 : 1 ~ 10까지 정수 중 2의 배수와 3의 배수 정수의 합 구하기
 */
public class Test10 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.print(n1+", ");
		System.out.print(n2+", ");
		
		for (int i=1; i<=10; i++) {
			n3 = n1+n2;
			System.out.print(n3+", ");
			
			n1=n2;
			n2=n3;
		}
		
	}

}
