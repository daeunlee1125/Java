package step6;
import java.util.Scanner;

/*
 * 문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 */
public class Main03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i < n*2-1; i++) {
			if (i<=n) {
				
			}
			
			for (int j= 0; j<Math.abs(n-i-1); j++) {
				System.out.print(" ");
			}
			if (i<n) {
				for (int j=0; j<i*2+1; j++) {
					System.out.print("*");
				}
			}else {
				for (int j=0; j<(2*n-i-2)*2+1; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}
/*
 * 0 0 5
 * 1 1 5
 * 2 2 5
 * 3 3 5
 * 4 4 5
 * 3 5 5
 * 2 6 5
 * 1 7 5
 * 0 8 5
 */
