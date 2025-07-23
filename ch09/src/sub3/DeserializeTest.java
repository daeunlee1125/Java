package sub3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이다은
 * 내용 : 자바 역직렬화 실습
 */
public class DeserializeTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\GGG\\Desktop\\Apple.data";
		
		try {
			
			// 역직렬화 위한 기본스트림 & 보조스트림 생성
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 역직렬화
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			// 스트림 종료
			ois.close();
			fis.close();
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
