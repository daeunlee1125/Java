package step8;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		int result = 0;
		
		char[] list = N.toCharArray();
		int cnt = 0;
		for (int i=list.length-1; i>=0; i--) {
			
			if ((list[i]-'0')<10&&(list[i]-'0')>=0) {
				result += (list[i]-'0')*Math.pow(B, cnt);
			}
			else {
				result += (list[i]-'A'+10)*Math.pow(B, cnt);
			}
			cnt++;
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
