package p294_Overriding;

public class OverrideEx {
	public static void main(String[] args) {
		Creature Avigale = new Human("Avigale");
		Creature Max = new Dog("Max");
		
		Avigale.action();
		Avigale.bark();
		
		Max.action();
		Max.bark();
		//Max.run();  >>> Creature로 업캐스팅되어 Dog의 고유 메서드는 사용 불가능!
		
		Dog Andy = new Dog("Andy");
		Andy.action();
		Andy.run();
		
	}
}
