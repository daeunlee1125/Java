package test1;
/*
 * 날짜 : 2025/07/09
 * 이름 : 이다은
 * 내용 : 1 ~ 10까지 정수 중 2의 배수와 3의 배수 정수의 합 구하기
 */
public class Test08 {
	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 0; i<n; i++) {
			for (int j= n-i; j>0; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
