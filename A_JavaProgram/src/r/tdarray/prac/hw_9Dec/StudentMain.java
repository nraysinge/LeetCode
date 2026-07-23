package r.tdarray.prac.hw_9Dec;

public class StudentMain {

	public static void main(String[] args) {
//		Student s1=new Student();
//		Student s2=new Student(122, 12, "fnfnfn","dfddf","fdfdd");
		
		Student.acceptArray();
		Student.showArrayData();
		Student.sortArraybyAge();
		System.out.println("-:After Sorting:-");
		Student.showArrayData();
		
	}
}
