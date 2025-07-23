package sub3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이다은
 * 내용 : 직렬화 실습
 */
public class SerializeTest {
	public static void main(String[] args) {
		
		// 직렬화 위해 Serializeable 인터페이스 구현된 객체
		Apple apple = new Apple("한국", 3000);
		String path = "C:\\Users\\GGG\\Desktop\\Apple.data";
		
		try {
			
			//직렬화를 위해, 기본 스트림 & 보조 스트림 생성
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// 객체 직렬화 //
			oos.writeObject(apple);
			
			// 스트림 종료 //
			oos.close();
			fos.close();
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		
	}
}
