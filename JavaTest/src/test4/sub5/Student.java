package test4.sub5;

//import java.util.Arrays;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		subjects = new Subject[10];
		scores = new int[10];
		subjectCount=0;
	}
	
	public void enrollSubject(Subject newSub) {
		System.out.printf("%s - %s 과목 신청완료\n", name, newSub.getName());
		subjects[subjectCount] = newSub;
		subjectCount++;
		newSub.addStudent(this);
	}
	
	public void setScore(Subject s, int score) {
		
		for (int i=0; i<subjectCount; i++) {
			if (subjects[i].equals(s)) {
				scores[i] = score;
				System.out.printf("%s - %s 점수 입력완료\n", name, s.getName());
				break;
			}
		}
		//scores[Arrays.asList(subjects).indexOf(s)] = score;
		//System.out.printf("%s - %s 점수 입력완료\n", name, s.getName());
	}
	
	public void printStudentInfo() {
		System.out.println("학생명 : "+name);
		System.out.println("아이디 : "+studentId);
		System.out.println("성적");
		for (int i=0; i<subjectCount; i++) {
			System.out.printf(" - %s:%d\n", subjects[i].getName(), scores[i]);
		}
	}
	
	public String getName() {
		return name;
	}
}
