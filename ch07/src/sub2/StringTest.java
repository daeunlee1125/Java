package sub2;

/*
 * 날짜 : 2025/07/21
 * 이름 : 이다은
 * 내용 : 자바 string 클래스 실습하기
 */
public class StringTest {
	public static void main(String[] args) {
		// 문자열(문자+배열) 생성
		String str1 = "Hello"; //문자열 literal
		String str2 = new String("Hello");
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		// 문자열 비교
		if (str1 == str2) {
			System.out.println("주소값 같은 문자열");
		}else {
			System.out.println("주소값 다른 문자열");
		}
		
		if (str1.equals(str2)) { //문자열 비교는 반드시!! equals
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}
		
		// 문자열 길이
		String message = "Hello,Korea";
		System.out.println("message : " + message);
		System.out.println("길이 : " + message.length());
		
		// 문자열 추출
		char c1 = message.charAt(0);
		char c2 = message.charAt(6);
		
		System.out.printf("c1 : %c || c2 : %c\n", c1, c2);
		
		// 문자열 자르기
		String substr1 = message.substring(0, 5); // 0부터 5까지 자름
		String substr2 = message.substring(5); // 5부터 끝까지 자름
		
		System.out.println("substr1 : " + substr1);
		System.out.println("substr2 : " + substr2);
		
		// 문자열 인덱스
		int idx1 = message.indexOf('o'); // 문자열의 앞에서부터 문자 o 탐색
		int idx2 = message.lastIndexOf('o'); //문자열의 뒤에서부터 문자 o 탐색
		
		System.out.printf("idxof first 'o' : %d\nidxof last 'o' : %d\n", idx1, idx2);
		
		idx1 = message.indexOf('e');
		idx2 = message.lastIndexOf('e');
		
		System.out.printf("idxof first 'e' : %d\nidxof last 'e' : %d\n", idx1, idx2);
		
		// 문자열 분리
		String[] words = message.split(",");
		for (String word : words) {
			System.out.println(word);
		}
		
		// 문자열 교체
		String rs1 = message.replace("Korea", "Busan"); //korea를 busan으로 교체
		String rs2 = message.replace("Hello", "Welcome");
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		
		// 문자열 변환
		int var1 = 1;
		double var2 = 2.1;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1); //IntToString
		String s2 = "" + var2; //DoubleToString
		String s3 = var3 + ""; //BoolToString
		
		System.out.println(s1 + "2");
		System.out.println(s2 + 1.2);
		System.out.println(s3 + false);
		
	}
}
