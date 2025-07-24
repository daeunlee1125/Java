package sub2;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 스레드 상태 실습하기
 */

class WorkThread extends Thread {
	
	@Override
	public void run() {
		for (int i=1; i<10; i++) {
			System.out.println("WorkThread - " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadJoinTest {
	public static void main(String[] args) {
		WorkThread work = new WorkThread();
		
		// 작업 스레드 실행
		work.start();
		
		// 좀비 스레드 방지 위해 넣는 코드
		// 부모가 작업 스레드 종료 대기함
		try {
			work.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
		// join 없이 실행해보면 메인 스레드 종료된 이후에도 자식 스레드 살아 움직인다
		// 이게 좀비 스레드임
		// 있으면 안 되겠죠!?
	}
}
