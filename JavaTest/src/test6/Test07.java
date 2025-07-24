package test6;

/*
 * 날짜 : 2025/07/24
 * 이름 : 이다은
 * 내용 : 자바 총정리 연습문제
 */
class Vehicle {
	private String kind;
	private int fee;
	public Vehicle(String kind, int fee) {
		super();
		this.kind = kind;
		this.fee = fee;
	}
	public void take(User user) {
		System.out.printf("%s은 %s를 탑니다.\n", user.getName(), kind);
		System.out.printf("%s요금은 %,d입니다.\n", kind, fee);
	}
	
}

class User {
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void take(Vehicle vehicle) {
		vehicle.take(this);
	}
}

public class Test07 {
	public static void main(String[] args) {
		User kim = new User("김유신");
		User lee = new User("이순신");
		
		Vehicle vehicle1 = new Vehicle("버스", 1500);
		Vehicle vehicle2 = new Vehicle("택시", 3000);
		
		kim.take(vehicle1);
		lee.take(vehicle2);
	}
}
