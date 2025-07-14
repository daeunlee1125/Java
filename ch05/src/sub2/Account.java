package sub2;

public class Account {
	
	//속성 (멤버변수)
	private String bank;
	private String id;
	private String name;
	private int balance;
	
	//생성자
	public Account(String bank, String id, String name, int balance) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	//getter, setter
	public String getbank() {
		return bank;
	}
	public void setbank(String bank) {
		this.bank = bank;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	//기능 (멤버메서드)
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("----------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
		System.out.println("----------------------");
	}
}
