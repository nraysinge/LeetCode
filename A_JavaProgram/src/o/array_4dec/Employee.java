package o.array_4dec;

import java.util.Scanner;

public class Employee {

	private String name, post;
	private int age, id;
	private double salary;

	private static Employee emparray[] = new Employee[3];// Employee is class.
															// then emparray store Employee(number of EMP).
//	public Employee() {
//
//	}
//	public Employee(String n, String p, int a, int i, double s) {
//		setId(i);
//		setName(n);
//		setSalary(s);
//		setAge(a);
//		setPost(p);
//	}

	public static void sortEmployeeByAge() {
		for(int i=0; i<emparray.length; i++) {
			for (int j=i; j<emparray.length; j++) {
				if(emparray[i].getAge()>emparray[j].getAge()) {
					Employee e2=emparray[i];
					emparray[i]=emparray[j];
					emparray[j]=e2;
				}
			} 
		}
	}

	public static void sortEmployeeBySalary() {
		for(int i=0; i<emparray.length; i++) {
			for (int j=i; j<emparray.length; j++) {
				if(emparray[i].getSalary()<emparray[j].getSalary()) {
					Employee e1=emparray[i];
					emparray[i]=emparray[j];
					emparray[j]=e1;
				} 
			}
		}
	}
	
	public static void acceptEmpArray() {
		System.out.println(" -:Enter Employee detials:- ");
		System.out.println();
		for (int k = 0; k < emparray.length; k++) {
			emparray[k] = new Employee();
			emparray[k].acceptData();
			if (k < emparray.length - 1) {
				System.out.println();
				System.out.println(" -:Enter Next Employee detials:- ");
				System.out.println();
			}
		}
	}

	public static void showEmpArray() {
		System.out.println();
		System.out.println(" -:Employee Detials:- ");
		for (int k = 0; k < emparray.length; k++) {
			emparray[k].showData();
		}
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1) Enter id of emp:- ");
		setId(sc.nextInt());
		System.out.print("2) Enter emp name:- ");
		setName(sc.next());
		System.out.print("4) Enter emp salary:- ");
		setSalary(sc.nextDouble());
		System.out.print("5) enter emp age:- ");
		setAge(sc.nextInt());
		System.out.print("6) Enter emp post:- ");
		setPost(sc.next());
	}

	public void showData() {
		System.out.println();
		System.out.print("1. Employee id is:- " + getId());
		System.out.print(", Employee name is:- " + getName());
		System.out.print(", Employee salaray:- " + getSalary());
		System.out.print(", Employee age:- " + getAge());
		System.out.print(", Employee post:- " + getPost());
	}

	public void setId(int i) {
		id = i;
	}

	public void setName(String n) {
		name = n;
	}

	public void setSalary(double s) {
		salary = s;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setPost(String p) {
		post = p;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public String getPost() {
		return post;
	}

}
