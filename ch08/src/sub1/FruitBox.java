package sub1;

//FruitBox에 사과도 넣고 바나나도 넣고... 범용적으로 쓰고 싶어!
public class FruitBox<T> { //제네릭 클래스 FruitBox의 치환변수 T 선언
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	
}
