package test4.sub5;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		students = new Student[10];
		studentCount = 0;
	}
	
	public void addStudent(Student newStud) {
		students[studentCount] = newStud;
		studentCount++;
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명 : " + subName);
		System.out.print("수강생 : ");
		
		for (int i = 0; i < studentCount; i++) {
			System.out.printf("%s, ", students[i].getName());
		}
		System.out.println();
	}
	
	public String getName() {
		return subName;
	}
}
