package test7.sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingMall {
	private List<Customer> customers;
	private List<Order> orders;
	private HashMap<String, List<Order>> customerOrders;
	
	public ShoppingMall() {
		this.customers = new ArrayList<Customer>();
		this.orders = new ArrayList<Order>();
		this.customerOrders = new HashMap<String, List<Order>>();
	}
	
	public void addCustomer(Customer c) {
		customers.add(c);
	}
	public void addOrder(Order o) {
		orders.add(o);
	}
	public List<Order> getOrders(){
		return orders;
	}
}
