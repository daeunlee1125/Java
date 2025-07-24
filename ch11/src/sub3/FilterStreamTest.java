package sub3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 필터 스트림 실습하기
 */
public class FilterStreamTest {
	public static void main(String[] args) {
		
		// 실습 리스트 생성
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3);
		System.out.println(numbers);
		
		// 중복 제거
		List<Integer> newNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(newNumbers);
		
		// 3 초과 필터링(3 이하만 남긴당), 중복 제거
		List<Integer> numbers3 = numbers
				.stream()
				.distinct() // 중복 제거
				.filter( num -> {
					if (num > 3) {
						return false;
					}else {
						return true;
					}
				})
				.collect(Collectors.toList());
		System.out.println(numbers3);
		
		// 짝수 데이터 필터링, 내림차순 정렬, 중복 제거
		List<Integer> evennumbers = numbers.stream()
								.distinct()
								.filter(num -> num%2 != 0)
								.sorted(Collections.reverseOrder())
								.collect(Collectors.toList());
		System.out.println(evennumbers); // 9 7 5 3 1
	}
}
