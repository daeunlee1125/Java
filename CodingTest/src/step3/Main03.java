package step3;

import java.util.Scanner;

/*
 * 문제
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

출력
1부터 n까지 합을 출력한다.
 */
public class Main03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int res = 0;
		
		for (int i =1;i<=n;i++) {
			res += i;
		}
		
		System.out.println(res);
		sc.close();
	}
}
