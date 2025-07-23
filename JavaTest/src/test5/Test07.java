package test5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이다은
 * 내용 : 로또번호 연습문제
 */
public class Test07 {
	public static void main(String[] args) {
		
		for (int count=1; count<=5; count++) {
			System.out.println(makeLotto());
		}
		
	}
	
	public static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<Integer>();
		
		for(;;) {
			int num = (int) Math.ceil(Math.random()*46);
			lottoSet.add(num);
			
			if (lottoSet.size()==6) {
				break;
			}
		}
		
		Set<Integer> treeSet = new TreeSet<Integer>(lottoSet);
		
		return treeSet;
	}
}
