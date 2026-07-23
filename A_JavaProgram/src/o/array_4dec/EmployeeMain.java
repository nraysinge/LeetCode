package o.array_4dec;

public class EmployeeMain {
	public static void main(String[] args) {
	//	Employee e = new Employee();
//		e.acceptData();
//		System.out.println("------Emp Ditials-----");
//		e.showData();
//
//		Employee e1 = new Employee("mayur", "Tester", 56, 121212, 5000.20);
//		System.out.println("------Emp Ditials-----");
//		e1.showData();
		
		
		Employee.acceptEmpArray();
		System.out.println();
		System.out.println("-----------------------");
		Employee.showEmpArray();
		
		Employee.sortEmployeeByAge();
		System.out.println();
		System.out.println("\n -: After sorting by age lover to age :-");
		Employee.showEmpArray();
		
		Employee.sortEmployeeBySalary();
		System.out.println();
		System.out.println("\n -: After sorting by Slary higher to lover :-");
		Employee.showEmpArray();
	}
}
