package step4;
import java.util.Scanner;

/*
입력
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

출력
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 */
public class Main02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int tar = sc.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		for (int k:arr) {
			if (k<tar) {
				System.out.print(k+" ");
			}
		}

		
		sc.close();
	}

}
