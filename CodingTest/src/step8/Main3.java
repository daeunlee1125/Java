package step8;
import java.util.Scanner;


public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int money = sc.nextInt();
			int q = money / 25;
			int d = (money - q*25) / 10;
			int ni = (money - q*25 - d*10) / 5;
			int pen = (money - q*25 - d*10 - ni*5) / 1;
			System.out.printf("%d %d %d %d\n", q, d, ni, pen);
		}
		
		sc.close();
	}
}
