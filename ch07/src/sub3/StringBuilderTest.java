package sub3;

public class StringBuilderTest {
	public static void main(String[] args) {
		
		//String의 불변성(Immutable)
		String str = "Java";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		
		str += "Programming"; //새로운 주소에 새로운 객체가 생긴다!
		System.out.println("str 주소 : " + System.identityHashCode(str)); 
		
		System.out.println(str);
		
		// 빈번한 문자열 변경을 위한 StringBuffer (=StringBuilder)
		StringBuffer sb = new StringBuffer("Java");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		sb.append("Programming"); //주소값 안 바뀐다!
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		sb.replace(0, 4, "C");
		System.out.println(sb);
		sb.insert(1, "냥");
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
	}
}
