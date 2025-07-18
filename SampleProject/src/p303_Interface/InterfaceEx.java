package p303_Interface;

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone sp = new SamsungPhone();
		ApplePhone ap = new ApplePhone();
		
		sp.sendCall();
		ap.sendCall();
		
		sp.flash();
		ap.camera();
		
		System.out.println(PhoneInterface.TIMEOUT);
		
	}
	
}
