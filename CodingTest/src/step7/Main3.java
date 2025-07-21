package step7;
import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] five = new char[5][15];
		
		
		for (int i=0; i<5; i++) {
			char[] input = sc.next().toCharArray();
			Arrays.fill(five[i], ' ');
			for (int j=0; j<input.length; j++) {
				five[i][j] = input[j];
			}
		}
		
		String res =  "";
		try {
			for (int i = 0; i<15; i++) {
				for (int j=0; j<5; j++) {
					if (five[j][i]!=' ') {
						System.out.print(five[j][i]);
					}
					
				}
			}
		} catch(Exception e) {
		}
		System.out.println(res);
		sc.close();
	}
}
