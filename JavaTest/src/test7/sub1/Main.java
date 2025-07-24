package test7.sub1;

/*
* 날짜 : 2025/07/24
* 이름 : 이다은
* 내용 : 자바 총정리 문제
*/
public class Main {
	public static void main(String[] args) {
		Doctor doctor1 = new Doctor("김의사", "D001", "내과");
		Doctor doctor2 = new Doctor("박의사", "D001", "외과");
		
		Patient patient1 = new Patient("이환자", "P001", 30, "감기");
		Patient patient2 = new Patient("박환자", "P002", 45, "고혈압");
		Patient patient3 = new Patient("최환자", "P003", 25, "알레르기");
		Patient patient4 = new Patient("김환자", "P004", 36, "비염");
		Patient patient5 = new Patient("정환자", "P005", 52, "허리디스크");
		
		doctor1.addPatient(patient1);
		doctor1.addPatient(patient2);
		doctor1.addPatient(patient3);
		
		doctor2.addPatient(patient4);
		doctor2.addPatient(patient5);
		
		System.out.println(doctor1);
		System.out.println(doctor2);
	}
}
