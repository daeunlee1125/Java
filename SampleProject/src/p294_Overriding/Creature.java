package p294_Overriding;

public class Creature {
	protected String name;
	
	protected Creature(String name) {
		this.name = name;
	}
	
	protected int legs() {
		return 4;
	}
	protected void action() {}
	protected void bark() {}
	
}
