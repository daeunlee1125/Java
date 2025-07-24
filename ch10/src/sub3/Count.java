package sub3;

public class Count {
	
	private int num = 0;
	
	public int getNum() {
		return num;
	}
	
	// synchronized : 동기화 블록! 스레드의 경쟁(Race Condition)을 막고, 순차적으로 스레드 실행
	/*
	 * synchronized 선언 안 해주면, 스레드들이 우연히 동시에 자원을 건드려서
	 * 여러 스레드의 각각의 활동이 그냥 하나로 처리될 수 있음
	 */
	public synchronized void setNum(int num) {
		// 임계 영역 : 하나의 스레드가 해당 영역에 들어올 때 Lock 걸고, 영역 빠져나가면서 해제
		this.num++;
		
	}
	// Semaphore 방식으로 처리할 수도!
}
