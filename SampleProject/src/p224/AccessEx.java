package p224;

class Sample{
	public int a;
	private int b;
	int c;
	protected int d;
	
	public void setb(int b) {
		this.b = b;
	}
	
	public int getb() {
		return b;
	}
}

class Sub extends Sample{
	public void method() {
		this.d = 10; //부모 클래스 속성 물려받아서 this로도 가능!
	}
}

public class AccessEx {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.a = 10;
		//sample.b = 10; >>>>오류 발생!
		sample.setb(10);
		System.out.println(sample.getb());
		sample.c = 10;
	}
}
