package test7.sub5;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNo;
	private Customer customer;
	private List<Product> products;
	private int totalPrice;
	public Order(int orderNo, Customer customer) {
		super();
		this.orderNo = orderNo;
		this.customer = customer;
		this.products = new ArrayList<Product>();
		this.totalPrice = 0;
	}
	
	public void addProduct(Product p) {
		this.products.add(p);
		this.totalPrice += p.getPrice();
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public List<Product> getProducts(){
		return products;
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
}
