package step6;
import java.util.Scanner;

/*
 * 문제
예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.

크로아티아 알파벳	변경
	č			c=
	ć			c-
	dž			dz=
	đ			d-
	lj			lj
	nj			nj
	š			s=
	ž			z=
예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.

dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

입력
첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.

단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.

출력
입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 */
public class Main06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] alp = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String word = sc.next();
		String buf = "";
		int wordcnt=0;
		
		for (int i=0; i<word.length(); i++) {
			buf += word.charAt(i);
			
			switch (buf.charAt(0)) {
			case 'c', 'd', 'l', 'n', 's', 'z':
				break;
			default:
				wordcnt++;
				buf = "";
				break;
			};
			
			if (buf!="") {
				for (int j=0; j<8; j++) {
					if (buf.contains(alp[j])) {
						wordcnt += buf.length()-alp[j].length()+1;
						buf = "";
						break;
					}
				}
			}
		}
		if (buf!="") {
			wordcnt += buf.length();
		}
		System.out.println(wordcnt);
		
		sc.close();
	}
}
