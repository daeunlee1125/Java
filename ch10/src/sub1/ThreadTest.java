package sub1;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 스레드 실습하기
 */

class SubThread extends Thread {
	
	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(name + " 작업 스레드 실행 : " + i);
		}
		System.out.println(name + " 작업 스레드 종료...");
	}
	
}

// 멀티스레드 프로그래밍
public class ThreadTest {
	public static void main(String[] args) {
		
		// 자식 스레드 객체 생성
		SubThread st1 = new SubThread("ST1");
		SubThread st2 = new SubThread("ST2");
		
		// 자식 스레드 실행
		//st1.run();
		//st2.run();
		
		// 자식 스레드 병행 실행
		st1.start();
		st2.start();
		
		
		for (int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("메인 스레드 실행 : " + i);
		}
		System.out.println("프로그램 종료...");
		
	}
}
