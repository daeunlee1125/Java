package sub3;

// 클래스 설계(정의)
public class Car {
	
	//속성 (멤버변수, 필드) : 무조건 private으로 선언 (외부에서 은닉)
	private String name;
	private String color;
	private int speed;
	
	// 전체 차량 수를 저장하는 클래스 변수
	public static int count; //클래스 변수(정적변수)는 일반적으로 public
	
	//생성자(Constructor): 속성을 초기화하는 메서드 (반환타입 없음, 메서드명 = 클래스명)
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++; //차량 증가
	}
	
	
	//기능 (멤버메서드) : 일단 무조건 public
	public void speedUp(int speed) {
		
		//this는 자기 참조 키워드
		//이 클래스의 멤버변수 참조
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + name);
		System.out.println("차량색 : " + color);
		System.out.println("현재속도 : " + speed);
		
	}
	
	//Getter, Setter : 은닉된 속성을 안전하게 처리하기 위한 메서드
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//클래스 변수의 getter도 클래스 메서드(정적메서드)가 되어야!
	public static int getCount() {
		return count;
	}
	
}
