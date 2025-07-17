package test4.sub5;

public class Main {
	public static void main(String[] args) {
		
		// 과목 생성
		Subject java = new Subject("자바");
		Subject database = new Subject("데이터베이스");
		Subject algo = new Subject("알고리즘");
		
		// 학생 생성
		Student student1 = new Student("김유신", "S001");
		Student student2 = new Student("김춘추", "S002");
		
		// 학생1 과목 수강 신청
		student1.enrollSubject(java);
		student1.enrollSubject(database);
		student1.enrollSubject(algo);
		System.out.println("--------------------");
		
		// 학생2 과목 수강 신청
		student2.enrollSubject(java);
		student2.enrollSubject(database);
		System.out.println("--------------------");
		
		// 학생1 성적 입력
		student1.setScore(java, 96);
		student1.setScore(database, 90);
		student1.setScore(algo, 50);
		System.out.println("--------------------");
		
		// 학생2 성적 입력
		student2.setScore(java, 86);
		student2.setScore(database, 76);
		System.out.println("--------------------");
		
		// subject1 정보 출력
		java.printSubjectInfo();
		System.out.println("--------------------");
		
		// subject2 정보 출력
		database.printSubjectInfo();
		System.out.println("--------------------");
		
		// subject3 정보 출력
		algo.printSubjectInfo();
		System.out.println("--------------------");
		
		// 학생1 정보 출력
		student1.printStudentInfo();
		System.out.println("--------------------");
		
		// 학생2 정보 출력
		student2.printStudentInfo();
		System.out.println("--------------------");
	}
}
