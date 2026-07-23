package t._15_12_2025;

import java.util.Scanner;

public class StudentJBK {

	private int id, age;
	private String name, DOB, city;
	private static int count = 0;

	private static StudentJBK stdarray[] = new StudentJBK[3];

	public StudentJBK() {
	}

	public StudentJBK(int id, int age, String name, String dob, String city) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.DOB = dob;
		this.city = city;
	}

	public static void studentManager() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nStudent Management System");
		while (true) {
			System.out.println("1. Add Student");
			System.out.println("2. Delet Student");
			System.out.println("3. Show all Student");
			System.out.println("4. Exit");
			System.out.println("Choose an option");

			int chois = sc.nextInt();
			sc.nextLine();

			switch (chois) {
			case 1:
				acceptArray();
				break;
			case 2:
				System.out.println("Enter Std ID to delete: ");
				int ID = sc.nextInt();
				deleteStudent(ID);
				break;
			case 3:
				showArrayData();
				break;
			case 4:
				System.out.println("Exiting..");
				sc.close();
				return;
			default:
				System.out.println("Invalid option ");
			}
		}
	}

	public static void deleteStudent(int ID) {
		for(int i=0; i<stdarray.length; i++) {
			if(stdarray[i]!=null && stdarray[i].getID()==ID) {
				stdarray[i]=null;
				System.out.println("Student deleted successfuly.");
				return;
			}
		}
		System.out.println("Student not found");
	}
	
	public static void acceptArray() {
		for (int i = 0; i < stdarray.length; i++) {
			stdarray[i] = new StudentJBK();
			//stdarray[i].acceptData(); bcz call in student manager*****
		}
	}

	public static void showArrayData() {
		for (int j = 0; j < stdarray.length; j++) {
			//stdarray[j].showData(); bcz call in student manager*****
		}
	}
	private void getData() {
		if (count < stdarray.length) {
			System.out.print("Add studen into array ");
			stdarray[count] = this;
			count++;
		} else {
			System.out.println("Arra is full.. \n");
		}
	}

	public static void sortArraybyAge() {

		for (int i = 0; i < stdarray.length; i++) {
			for (int j = i + 1; j < stdarray.length; j++) {
				if (stdarray[i].getAge() > stdarray[j].getAge()) {
					StudentJBK s1 = stdarray[i];
					stdarray[i] = stdarray[j];
					stdarray[j] = s1;
				}
			}
		}
	}

	

	public void acceptData() {
		System.out.println();
		Scanner sc = new Scanner(System.in);
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
		System.out.println("\n -:Enter Next Std Data:- \n");
	}

	public void showData() {
		// System.out.println("\n -:Student Detials:-");
		System.out.println("Student ID is:- " + getID() + ", Student Age is:- " + getAge() + ", Student Name is:- "
				+ getName() + ", Student DOB is:- " + getDOB() + ", Student City is:- " + getCity());
//		System.out.println("Student Age is:- "+getAge());
//		System.out.println("Student Name is:- "+getName());
//		System.out.println("Student DOB is:- "+getDOB());
//		System.out.println("Student City is:- "+getCity());
	}

	public void setID(int i) {
		this.id = i;
	}

	public void setAge(int a) {
		this.age = a;
	}

	public void setName(String n) {
		this.name = n;
	}

	public void setDOB(String d) {
		this.DOB = d;
	}

	public void setCity(String c) {
		this.city = c;
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
