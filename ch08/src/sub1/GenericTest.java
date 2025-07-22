package sub1;

import java.util.ArrayList;

/*
 * 날짜 : 2025/07/22
 * 이름 : 이다은
 * 내용 : 자바 제네릭 실습하기
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("대만", 2000);
		
		FruitBox<Apple> box1 = new FruitBox<>();
		FruitBox<Banana> box2 = new FruitBox<>();
		
		box1.setFruit(apple);
		box2.setFruit(banana);
		
		System.out.println(box1.getFruit());
		System.out.println(box2.getFruit());
		
		
	}
}
