package l.encapsulation.hw_28nov;

import java.util.Scanner;

public class Employee {
	private String name;
	private int id, age;
	private double salary;

	public Employee() {
		acceptData();
		showData();
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name:- ");
		setName(sc.next());
		System.out.print("Enter the id:- ");
		setId(sc.nextInt());
		System.out.print("Enter the age:- ");
		setAge(sc.nextInt());
		System.out.print("Enter sub salary:- ");
		setSalary(sc.nextDouble());
	}

	public void showData() {
		System.out.println();
		System.out.println("-------emp detials------------");
		System.out.println();
		System.out.println("name is :- " + getName());
		System.out.println("id is :- " + getId());
		System.out.println("age is :- " + getAge());
		System.out.println("salary is :- " + getSalary());
	}

	public void setName(String n) {
		name = n;
	}

	public void setId(int i) {
		id = i;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setSalary(double s) {
		salary = s;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}
}
