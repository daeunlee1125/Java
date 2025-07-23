package sub3;

import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이다은
 * 내용 : 자바 버퍼 스트림 실습
 */
public class PropertiesTest {
	public static void main(String[] args) {
		
		// Map<String, String> map = new HashMap<String, String>();와 동일
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		System.out.println(prop);
		
		// 직렬화
		String path = "C:\\Users\\GGG\\Desktop\\fruit.properties";
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null);
			fos.close();
			
			fos.close();
		} catch(Exception e) {
			e.getStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
