package step6;
import java.util.Scanner;

/*
 * 
문제
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
public class Main05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toLowerCase();
		
		int[] used = new int[26];
		for (int i=0;i<word.length();i++) {
			used[word.charAt(i)-'a']++;
		}
		int max = 0;
		int rem = 0;
		int count = 0;
		for (int i=0; i<26; i++) {
			if (used[i]>max) {
				max = used[i];
				rem = i;
				count = 0;
			}else if (used[i] == max) {
				count++;
			}
		}
		
		if (count==0) {
			System.out.printf("%c", ('A'+rem));
		}else {
			System.out.println("?");
		}
		
		sc.close();
	}
}
