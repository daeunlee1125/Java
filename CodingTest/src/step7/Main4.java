package step7;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] paper = new int[100][100];
		
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int j=y; j<y+10; j++) {
				for (int r=x; r<x+10; r++) {
					if (j<100 && r<100) {
						paper[j][r] = 1;
					}
				}
			}
		}

		int cnt = 0;
		for (int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				if (paper[i][j]==1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
