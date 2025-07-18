package p303_Interface;

public class ApplePhone implements PhoneInterface {
	public void sendCall() {
		System.out.println("띠로링");
	}
	public void receiveCall() {
		System.out.println("전화를 받으시겠습니까?");
	}
	public void camera() {
		System.out.println("찰칵");
	}
}
