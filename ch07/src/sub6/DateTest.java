package sub6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2025/07/22
 * 이름 : 이다은
 * 내용 : 자바 날짜/시간 클래스 실습하기
 */
public class DateTest {
	public static void main(String[] args) {
		//Date 클래스
		Date date = new Date();
		System.out.println("date : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String result = sdf.format(date);
		System.out.println("result : " + result);
		
		// Calendar 클래스
		// 싱글톤 객체 -> 객체 생성 불가. getInstance 메서드 사용
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; // Month는 0부터 시작
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%02d-%02d %02d:%02d:%02d\n", year, month, day, hour, min, sec);
		
	}
}
