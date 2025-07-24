package sub2;


/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 스레드 상태 실습하기
 */
class Sub1Thread extends Thread{
	public void run() {
		for (int i=0; i<1000; i++) {
			System.out.println("Sub1Thread : " + i);
			
			Thread.yield();
		}
	}
}


class Sub2Thread extends Thread{
	public void run() {
		for (int i=0; i<1000; i++) {
			System.out.println("Sub2Thread : " + i);
		}
	}
}

public class ThreadYieldTest {
	public static void main(String[] args) {
		Sub1Thread s1 = new Sub1Thread();
		Sub2Thread s2 = new Sub2Thread();
		
		s1.start();
		s2.start();
		
		try {
			s1.join();
			s2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
