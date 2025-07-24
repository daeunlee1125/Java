package test7.sub1;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	private String name;
	private String id;
	private String special;
	private List<Patient> patients;
	public Doctor(String name, String id, String special) {
		super();
		this.name = name;
		this.id = id;
		this.special = special;
		this.patients = new ArrayList<Patient>();
	}
	public void addPatient(Patient pa) {
		patients.add(pa);
	}
	@Override
	public String toString() {
		String a = "의사: " + name + "(ID: " + id + ", 전문분야: " + special + ")\n담당 환자 목록:\n";
		for (int i=0; i<patients.size();i++) {
			a += patients.get(i).toString();
		}
	
		return a;
	}
	
}
