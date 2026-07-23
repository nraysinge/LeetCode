package m.constructor_2dec;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.showData();
		Student s2=new Student(10, "hdhfd");
		s2.showData();
		Student s3=new Student(10, "hdhfd","a+");
		s3.showData();
	}
}
