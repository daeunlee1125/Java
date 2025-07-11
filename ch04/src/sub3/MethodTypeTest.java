package sub3; 

//Home키+shift키 누르면 블록 앞으로 지정
//End키+shift키 누르면 블록 뒤로 지정

public class MethodTypeTest{
		
	public static void main(String[] args) {
		//type1()
		double y1 = type1(2.5);
		double y2 = type1(3.2);
		double y3 = type1(4.0);
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		System.out.println("y3 : "+y3);
		
		//type2()
		type2(true);
		type2(false);
		type2(2>3);
		
		//type3()
		boolean result = type3();
		System.out.println("result : "+result);
		
		//type4()
		type4();
		
	}
	
	//type1 : 매개변수 O, 반환값 O
	public static double type1(double r) {
		double y = r * r * Math.PI;
		return y;
	}
	//type1 : 매개변수 O, 반환값 X
	public static void type2(boolean status) {
		if (status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}
	}
	//type1 : 매개변수 X, 반환값 O
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		if (num1>num2) {
			return true;
		}else {
			return false;
		}
	}
	//type1 : 매개변수 X, 반환값 X
	public static void type4() {
		double result = type1(5.0);
		System.out.println("반지름 5인 원의 넓이 : "+result);
	}
}