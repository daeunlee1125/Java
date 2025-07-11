package step6;
import java.util.Scanner;

/*
 * 
 */
public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		System.out.println(drom(word));
		
		sc.close();
	}
	
	public static int drom(String word) {
		
		for (int i=0; i<word.length()/2; i++) {
			if (word.charAt(i)!=word.charAt(word.length()-i-1)) {
				return 0;
			}
		}
		
		return 1;
		
	}
}
