package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이다은
 * 내용 : 자바 파일 입출력 스트림 실습
 */
public class StreamTest {
	public static void main(String[] args) {
		
		String source = "C:\\Users\\GGG\\Desktop\\sample1.txt";
		String target = "C:\\Users\\GGG\\Desktop\\sample2.txt";
		
		try {
			// 스트림 생성(파일 연결)
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 문자 스트림
			FileReader fr = new FileReader(source);
			FileWriter fw = new FileWriter(target);
			
			// 무한 반복으로 스트림 작업 수행
			while(true) {
				
				// 파일 읽기
				int data = fis.read(); //데이터가 하나씩 스트림 통해 흘러감!
				// 문자 읽기
				int text = fr.read();
				
				
				if (data == -1 || text == -1) {
					break;
				}
				
				// 바이트 스트림 출력
				/*System.out.println((char)data);*/
				
				// 문자 스트림 출력
				/*System.out.println((char)text);*/
				
				// 파일 쓰기 (바탕화면에 sample2.txt 만들어짐!)
				//fos.write(data);
				fw.write((char) text);
			}
			// 스트림 작업 종료
			fis.close();
			fos.close();
			fr.close();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
		
	}
}
