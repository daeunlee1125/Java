package step7;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] five = new char[5][15];
		Arrays.fill(five, null);
		
		for (int i=0; i<5; i++) {
			five[i] = sc.next().toCharArray();
		}
		
		String res =  "";
		
		for (int i = 0; i<15; i++) {
			for (int j=0; j<5; j++) {
				res += five[j][i];
			}
		}
		
		System.out.println(res);
		sc.close();
	}
}
