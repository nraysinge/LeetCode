package r.tdarray.prac.hw_9Dec;

import java.util.Scanner;

public class Student {

	private int id, age;
	private String name, DOB, city;
	
	private static Student stdarray[]=new Student[2];
	
	public Student() {
		setID(12);
		setAge(15);
		setName("matur");
		setDOB("06-06-2004");
		setCity("jalgon");
		//showData();
	}

	public Student(int i, int a, String n, String d, String c) {
		setID(i);
		setAge(a);
		setName(n);
		setDOB(d);
		setCity(c);
		showData();
	}
	
	public static void sortArraybyAge() {
		
		for(int i=0; i<stdarray.length; i++) {
			for(int j=i+1; j<stdarray.length; j++) {
				if(stdarray[i].getAge()>stdarray[j].getAge()) {
					Student s1=stdarray[i];
					stdarray[i]=stdarray[j];
					stdarray[j]=s1;
				}
			}
		}
	}
	public static void acceptArray() {
		for(int i=0; i<stdarray.length; i++) {
			stdarray[i]=new Student();
			stdarray[i].acceptData();
		}
	}
	public static void showArrayData() {
			for(int j=0; j<stdarray.length; j++) {
			stdarray[j].showData();
		}
	}
	
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student ID:- ");
		setID(sc.nextInt());
		System.out.print("Enter Student Age:- ");
		setAge(sc.nextInt());
		System.out.print("Enter Student Name:- ");
		setName(sc.next());
		System.out.print("Enter Student DOB:- ");
		setDOB(sc.next());
		System.out.print("Enter Student City:- ");
		setCity(sc.next());
	}
	public void showData() {
		System.out.println("\n -:Student Detials:-");
		System.out.println("Student ID is:- "+getID());
		System.out.println("Student Age is:- "+getAge());
		System.out.println("Student Name is:- "+getName());
		System.out.println("Student DOB is:- "+getDOB());
		System.out.println("Student City is:- "+getCity());
	}
	public void setID(int i) {
		id=i;
	}
	public void setAge(int a) {
		age=a;
	}
	public void setName(String n) {
		name=n;
	}
	public void setDOB(String d) {
		DOB=d;
	}
	public void setCity(String c) {
		city=c;
	}
	public int getID() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getDOB() {
		return DOB;
	}
	public String getCity() {
		return city;
	}
}
