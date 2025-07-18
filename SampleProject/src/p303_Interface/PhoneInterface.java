package p303_Interface;

interface PhoneInterface {
	public static int TIMEOUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public default void printLogo() {
		System.out.println("*** Phone ***");
	}
}
