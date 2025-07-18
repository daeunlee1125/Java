package p294_Overriding;

import java.util.Random;

public class Dog extends Creature {
	protected Dog(String name) {
		super(name);
	}
	protected void action() {
		Random rand = new Random();
		String[] acquire = {"뼈다귀", "고기", "공", "다람쥐"};
		System.out.printf("%s가 %s(을/를) 물고 왔다!\n", this.name, acquire[rand.nextInt(acquire.length)]);
	}
	
	protected void bark() {
		System.out.println(this.name +" : 멍멍");
	}
	
	protected void run() {
		System.out.println(this.name + " : 헥헥");
	}
}
