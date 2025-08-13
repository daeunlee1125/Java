package sub3;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 스레드 동기화 실습하기
 */
public class ThreadSyncTest {
	public static void main(String[] args) {
		Count count = new Count();
		
		CountThread c1 = new CountThread(count);
		CountThread c2 = new CountThread(count);
		CountThread c3 = new CountThread(count);
		
		c1.start();
		c2.start();
		c3.start();
		
		try {
			c1.join();
			c2.join();
			c3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("최종 결과 : " + count.getNum());
	}
	>> 스레드끼리 자원 접근 충돌 일어나지 않아, 정상적으로 300 출력
	>> 동기화 안 해주면, 동시에 count++에 접근하면서
	하나의 동작으로 처리될 위험 케이스 O
	그래서 가끔씩 300보다 낮은 수가 출력된다!
}
