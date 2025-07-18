package p303_Interface;

public class SamsungPhone implements PhoneInterface{
	public void sendCall() {
		System.out.println("따르릉");
	}
	public void receiveCall() {
		System.out.println("전화 왔습니다!");
	}
	public void printLogo() {
		System.out.println("$$ Samsung %%");
	}
	public void flash() {
		System.out.println("light on!");
	}
}
