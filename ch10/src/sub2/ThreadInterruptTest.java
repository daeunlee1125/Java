package sub2;
/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 스레드 상태 실습하기
 */

class SubThread extends Thread{
	@Override
	public void run() {
		int i=1;
		
		try {
			// 무한루프 써도 메인 스레드에서 인터럽트 받아서 멈춘다!
			while (true) {
				System.out.println("SubThread - " + i);
				i++;
				
				// 1초 일시 정지하는 사이에 깨우는 인터럽트 발생하는 Exception
				// 근데 혹시나 sleep 아닐 때 인터럽트 발생하면
				// 무한루프 발생할 수도...
				Thread.sleep(1000);
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

public class ThreadInterruptTest {
	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		
		// 작업 스레드 실행
		sub.start();
		
		// 메인 스레드 10초 대기
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 작업 스레드 일시정지 발생시키기
		sub.interrupt();
		
		System.out.println("프로그램 종료...");
	}
}
