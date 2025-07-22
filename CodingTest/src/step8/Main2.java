package step8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		List<Character> res = new ArrayList<Character>();
		while (n>0) {
						
			if (n%b<10 && n%b>=0) {
				res.add(0, (char)((n%b)+'0'));
			}else {
				res.add(0, (char)((n%b)+'A'-10));
			}
			n = n/b;
		}
		
		for (Character i : res) {
			System.out.print(i);
		}
		sc.close();
	}
}
