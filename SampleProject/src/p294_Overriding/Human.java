package p294_Overriding;

import java.util.Random;

public class Human extends Creature {
	protected Human(String name) {
		super(name);
	}
	protected int legs() {
		return 2;
	}
	protected void action() {
		Random rand = new Random();
		String[] actions = {"친구들과 파티하기", "집에 박혀있기", "음식 섭취", "대화하기", "깊생"};
		System.out.println(this.name + " 활동중 : " + actions[rand.nextInt(5)]);
	}
	protected void bark() {
		System.out.println(this.name + " : 안녕!");
	}
}
