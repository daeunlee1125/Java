package p281;

/*
 * 날짜 : 2025/07/18
 * 이름 : 이다은
 * 내용 : 교재 p281 업캐스팅 객체의 클래스 구분하기
 */
class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceOfEx {
	//타입 검사(부모부터 마지막 자식까지!)
	static void print(Person p) {
		if (p instanceof Person) {
			System.out.print("Person ");
		}
		if (p instanceof Student) {
			System.out.print("Student ");
		}
		if (p instanceof Researcher) {
			System.out.print("Researcher ");
		}
		if (p instanceof Professor) {
			System.out.print("Professor ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student -> ");
		print(new Student());
		
		System.out.print("new Researcher -> ");
		print(new Researcher());
		
		System.out.print("new Professor -> ");
		print(new Professor());
	}
}
