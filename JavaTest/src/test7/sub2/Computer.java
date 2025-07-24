package test7.sub2;

public class Computer extends Product {
	private String manufactor;

	public Computer(String prodId, String prodName, int price, int quantity, String manufactor) {
		super(prodId, prodName, price, quantity);
		this.manufactor = manufactor;
	}
	
	public void printProductInfo() {
		super.printProductInfo();
		System.out.printf("제조사 : %s\n", manufactor);
	}
}
