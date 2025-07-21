package sub1;

public class Apple extends Object { // 자바의 모든 클래스는 암묵적으로 Object를 상속받음
	//이렇게 명시적으로 extends Object 안 해줘도 대겠죵?
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() { 
		// 클래스 정보 출력 메서드
		// 우클릭 -> source -> generate toString으로 바로 생성해줄수도 있다!
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	

}
