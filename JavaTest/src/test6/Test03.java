package test6;

import java.util.Scanner;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 총정리 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
		int sum=0;
		for (int i=1; i<=n; i++) {
			int fact = 1;
			for (int j=2; j<=i; j++) {
				fact *= j;
			}
			sum += fact;
			System.out.printf("%2d! = %,10d\n", i, fact);
		}
		System.out.printf("1! + 2! + ... + %d! = %,d\n", n, sum);
		
		sc.close();
	}
}
