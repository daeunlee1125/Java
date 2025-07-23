package test5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜 : 2025/07/23
 * 이름 : 이다은
 * 내용 : 파일 입출력 연습문제
 */
public class Test10 {
	public static void main(String[] args) {
		String path = "C:\\Users\\GGG\\Desktop\\Result.txt";
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for (int x=2; x<=9; x++) {
				fw.write(x + "단\n");
				for (int y=1; y<=9; y++) {
					fw.write(x+" x "+y+" = "+x*y+"\n");
				}
			}
			fw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("구구단 파일 출력 완료...");
	}

}
