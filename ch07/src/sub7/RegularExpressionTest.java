package sub7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 날짜 : 2025/07/22
 * 이름 : 이다은
 * 내용 : 자바 정규표현식 실습하기
 */
public class RegularExpressionTest {
	public static void main(String[] args) {
		// 정규표현식 기본
		String pattern = "a[a-z]*";
		
		boolean rs1 = Pattern.matches(pattern, "apple"); //위의 RE 패턴에 부합하는가?
		boolean rs2 = Pattern.matches(pattern, "banana");
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		
		
		String[] patterns = {
				"[0-9]+",  	// 숫자 1개 이상
				"1[0-9]*", 	// 1로 시작하는 숫자 0개 이상
				"^[0-9]",  	// 숫자로 시작하는 문자
				"[^0-9]",  	// 숫자가 아닌 문자
				".",	   	// 문자 1개
				"[a-z]?",	// 영어 소문자 1개
				"[a-z]*",	// 영어 소문자 0개 이상
				"[a-z]+",	// 영어 소문자 1개 이상
				"[A-Z]*",	// 영어 대문자 0개 이상
				"[가-힣]+",	// 한글 1자 이상
				"^[0-9a-z]*",   // 숫자+영어 조합 0개 이상								
				"^[0-9가-힣]*",  // 숫자+한글 조합 0개 이상
				"^[A-Z][a-z]*", // 영어 대문자로 시작하는 문자 0개 이상 
				"\\s",		// 공백
				"\\S",		// 공백이 아닌 문자
				"\\d",		// 숫자
				"\\w",		// 숫자와 문자
				"\\W",		// 특수문자
			};
		
		String[] words = {"apple", "123abc", "123456", "011한글", "hello", "홍길동", "1", "Banana", "APPLE", "#"};
		for(String word : words) {
			System.out.printf("\"%s\" 문자와 일치하는 패턴 : ", word);
			for (String ptt : patterns) {
				boolean result = Pattern.matches(ptt, word);
				
				if (result) {
					System.out.print(ptt + ", ");
				}
			}
			System.out.println();
		}
		
		// 자주 사용하는 정규표현식
				String input = "a101,홍길동,010-1234-1001,hong@gmail.com";

				// 패턴 정의
				String ptt1 = "^[a-z][a-z0-9]{3,10}$"; // 아이디 검증 대표 패턴! 영어 소문자 1자로 시작하고 소문자, 숫자 3자리 이상 10자리 미만
				String ptt2 = "^[가-힣]*$";
				String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})";
				String ptt4 = "(\\w+)@(\\w+).(\\w+)";

				// 패턴 컴파일
				Pattern p1 = Pattern.compile(ptt1);
				Pattern p2 = Pattern.compile(ptt2);
				Pattern p3 = Pattern.compile(ptt3);
				Pattern p4 = Pattern.compile(ptt4);

				// Matcher 생성
				Matcher m1 = p1.matcher(input.split(",")[0]); //a101
				Matcher m2 = p2.matcher(input.split(",")[1]); //홍길동
				Matcher m3 = p3.matcher(input.split(",")[2]); //010-1234-1001
				Matcher m4 = p4.matcher(input.split(",")[3]); //hong@gmail.com

				// 아이디 찾기
				System.out.print("아이디 : ");
				while (m1.find()) {
					System.out.println(m1.group());
				}

				// 이름 찾기
				System.out.print("이름 : ");
				while (m2.find()) {
					System.out.println(m2.group());
				}
				
				// 휴대폰 찾기
				System.out.print("휴대폰 : ");
				while (m3.find()) {
					System.out.println(m3.group());
				}
				
				// 이메일 찾기
				System.out.print("이메일 : ");
				while (m4.find()) {
					System.out.println(m4.group());
				}
	}
}
