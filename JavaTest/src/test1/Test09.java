package test1;
/*
 * 날짜 : 2025/07/09
 * 이름 : 이다은
 * 내용 : 1 ~ 10까지 정수 중 2의 배수와 3의 배수 정수의 합 구하기
 */
public class Test09 {
	public static void main(String[] args) {
		int count = 0;
		
		for (int i=1; i<=9; i++) {
			if (i<=5) {
				count = i;
			
			}else {
				count = 9-i+1;
				
			}
			for (int j=1; j<=5-count; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k<=2*count-1; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
