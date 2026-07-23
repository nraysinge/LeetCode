package m.constructor_2dec;

public class Student {
	int studentID;
	String studentName, grade;
	
	public Student() {
		studentID=123;
		studentName="mayur";
		grade="A+";
	}
	
	public Student(int sid, String sname) {
		
		studentID=sid;
		studentName=sname;
	}
public Student(int sid, String sname, String gr) {
		
		studentID=sid;
		studentName=sname;
		grade=gr;
		
	}
	public void showData() {
		System.out.println("Student id is:- "+studentID);
		System.out.println("studentName is:- "+studentName);
		System.out.println("Student grade is:- "+grade);
		
	}
	
}
