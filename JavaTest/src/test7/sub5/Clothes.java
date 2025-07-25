package test7.sub5;

public class Clothes implements Product {
	private String name;
	private int price;
	
	
	public Clothes(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
