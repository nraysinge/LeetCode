package u.poly.overrideng;

public class EmpMain {
	public static void main(String[] args) {
		
	
		Employee e=new Employee();
		double f=e.calculateSalary();
		System.out.println(f);
		
		Manager m=new Manager();
		double d=m.calculateSalary();
		System.out.println(d);
	}
}
