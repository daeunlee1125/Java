package test4.sub1;

public class StudentScore {
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	public StudentScore(String studentName, String studentID, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentID;
		this.subject = subject;
		this.score = score;
	}
	
	public void updateScore(double NewScore) {
		if (NewScore<=100&&NewScore>=0) {
			score = NewScore;
			System.out.println("점수 수정 완료");
		}else {
			System.out.println("잘못된 점수 입력");
		}
	}
	
	public double getScore() {
		return score;
	}
	
	public void printStudentInfo() {
		System.out.println("학생이름 : "+studentName);
		System.out.println("학생 ID : "+studentId);
		System.out.println("과목 : "+subject);
		System.out.println("점수 : "+score);
		
	}
}
