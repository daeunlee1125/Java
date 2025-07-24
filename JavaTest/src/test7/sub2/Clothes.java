package test7.sub2;

public class Clothes extends Product {
	private String size;

	public Clothes(String prodId, String prodName, int price, int quantity, String size) {
		super(prodId, prodName, price, quantity);
		this.size = size;
	}
	
	public void printProductInfo() {
		super.printProductInfo();
		System.out.printf("제조사 : %s\n", size);
	}
}
