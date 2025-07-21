package sub1;

/*
 * 날짜 : 2025/07/21
 * 이름 : 이다은
 * 내용 : 자바 Object 클래스 실습하기
 */
public class ObjectTest {
	public static void main(String[] args) {
		
		// 모든 클래스는 Object 상속받으니까
		// 무슨 클래스든 Object로 업캐스팅도 가능
		Object a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("일본", 2000);
		
				
		// toString() - 객체 정보 조회
		System.out.println(a1.toString());
		System.out.println(a2); //toString은 default 메서드라서, 객체 이름만으로 호출가능
		
		
		if (a1 == a2) {
			System.out.println("a1, a2의 주소값 동일");
		}else {
			System.out.println("a1, a2의 주소값 다름");
		}
		
		
		//Object 메서드 equals로 비교
		if (a1.equals(a2)) {
			System.out.println("a1, a2는 같은 사과");
		}else {
			System.out.println("a1, a2는 다른 사과");
		}
		
		Object a3 = new Apple("한국", 3000);
		if (a1 == a3) {
			System.out.println("a1, a3의 주소값 동일");
		}else {
			System.out.println("a1, a3의 주소값 다름");
		}
		if (a1.equals(a3)) {
			System.out.println("a1, a3은 같은 사과");
		}else {
			System.out.println("a1, a3은 다른 사과");
		}
		
		
		System.out.println("a1 해시값 : "+a1.hashCode());
		System.out.println("a2 해시값 : "+a2.hashCode());
	}
}
