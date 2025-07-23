package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이다은
 * 내용 : 자바 버퍼 스트림 실습
 */
public class BufferStreamTest {
	public static void main(String[] args) {
		
		// 기본 스트림 생성 (파일 연결) //
		String source = "C:\\Users\\GGG\\Desktop\\Person.tif";
		String target = "C:\\Users\\GGG\\Desktop\\Person2.tif";
				
		try {
			// 기본 스트림 생성(파일 연결)
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 보조 스트림(Buffer) 생성
			BufferedInputStream  bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// 무한 반복으로 스트림 작업 수행
			while(true) {
				
				// 파일 읽기
				int data = bis.read(); //데이터가 하나씩 스트림 통해 흘러감!				
				
				if (data == -1) {
					break;
				}
				
				// 바이트 스트림 출력
				/*System.out.println((char)data);*/
				
				bos.write(data);
			}
			
			// 스트림 작업 종료
			fis.close();
			fos.close();
			bis.close();
			bos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
		
		
	}
}
