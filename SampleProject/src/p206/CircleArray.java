package p206;

/*
 * 날짜 : 2025/07/18
 * 이름 : 이다은
 * 내용 : 교재 p206 객체 배열 실습
 */
class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray{
	public static void main(String[] args) {
		Circle[] c;
		c = new Circle[5];
		
		for (int i=0;i<5;i++) {
			c[i] = new Circle(i);
		}
		
		for (int i=0;i<c.length;i++) {
			System.out.print((int)c[i].getArea() + " ");
		}
	}
}