package sub4;


/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 스레드 제어 실습하기
 */

class WorkObject {
	// 서로 한 턴씩 실행하고 넘겨준다! 순서 제어
	public synchronized void method1() {
		Thread th = Thread.currentThread();
		System.out.println(th.getName() + " - method1 실행...");
		
		// 다른 스레드를 실행 상태로 전환
		notify();
		
		// 그리고 자신은 일시 정지 상태로 전환
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void method2() {
		synchronized (this) {
			Thread th = Thread.currentThread();
			System.out.println(th.getName() + " - method2 실행...");
			
			// 다른 스레드를 실행 상태로 전환
			notify();
			
			// 그리고 자신은 일시 정지 상태로 전환
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadA extends Thread{
	private WorkObject work;
	
	public ThreadA(WorkObject work) {
		this.work = work;
		setName("ThreadA"); // 부모클래스(Thread) 메서드로 스레드 이름 초기화
	}
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			work.method1();
		}
	}
}

class ThreadB extends Thread{
	private WorkObject work;
	
	public ThreadB(WorkObject work) {
		this.work = work;
		setName("ThreadB"); // 부모클래스(Thread) 메서드로 스레드 이름 초기화
	}
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			work.method2();
		}
	}
}

public class ThreadNotifyTest {
	
	public static void main(String[] args) {
		WorkObject work = new WorkObject();
		
		ThreadA thA = new ThreadA(work);
		ThreadB thB = new ThreadB(work);
		
		thA.start();
		thB.start();
		
		try {
			thA.join();
			thB.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		System.out.println("프로그램 종료...");
	}
}
