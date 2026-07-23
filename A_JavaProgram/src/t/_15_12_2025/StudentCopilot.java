package t._15_12_2025;

import java.util.Scanner;

public class StudentCopilot {
	
	 private int id, age;
	    private String name, DOB, city;
	    private static int count = 0;

	    private static StudentJBK stdarray[] = new StudentJBK[3];

	    public StudentCopilot() {}

	    public StudentCopilot(int id, int age, String name, String dob, String city) {
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
	            System.out.println("1. Add Students");
	            System.out.println("2. Delete Student");
	            System.out.println("3. Show all Students");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");

	            int chois = sc.nextInt();
	            sc.nextLine();

	            switch (chois) {
	                case 1:
	                    acceptArray(sc);
	                    break;
	                case 2:
	                    System.out.print("Enter Student ID to delete: ");
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
	        for (int i = 0; i < stdarray.length; i++) {
	            if (stdarray[i] != null && stdarray[i].getID() == ID) {
	                stdarray[i] = null;
	                System.out.println("Student deleted successfully.");
	                return;
	            }
	        }
	        System.out.println("Student not found");
	    }

	    public static void acceptArray(Scanner sc) {
	        while (count < stdarray.length) {
	            StudentJBK s = new StudentJBK();
	            s.acceptData();
	            stdarray[count] = s;
	            count++;
	        }
	        if (count == stdarray.length) {
	            System.out.println("Array is full. Cannot add more students.");
	        }
	    }

	    public static void showArrayData() {
	        System.out.println("\n--- Student Details ---");
	        for (int j = 0; j < stdarray.length; j++) {
	            if (stdarray[j] != null) {
	                stdarray[j].showData();
	            }
	        }
	    }

	    public void acceptData(Scanner sc) {
	        System.out.print("Enter Student ID: ");
	        setID(sc.nextInt());
	        System.out.print("Enter Student Age: ");
	        setAge(sc.nextInt());
	        sc.nextLine(); // consume newline
	        System.out.print("Enter Student Name: ");
	        setName(sc.nextLine());
	        System.out.print("Enter Student DOB: ");
	        setDOB(sc.nextLine());
	        System.out.print("Enter Student City: ");
	        setCity(sc.nextLine());
	        System.out.println("Student added successfully!\n");
	    }

	    public void showData() {
	        System.out.println("ID: " + getID() + ", Age: " + getAge() + ", Name: " + getName()
	                + ", DOB: " + getDOB() + ", City: " + getCity());
	    }

	    public void setID(int i) { this.id = i; }
	    public void setAge(int a) { this.age = a; }
	    public void setName(String n) { this.name = n; }
	    public void setDOB(String d) { this.DOB = d; }
	    public void setCity(String c) { this.city = c; }

	    public int getID() { return id; }
	    public int getAge() { return age; }
	    public String getName() { return name; }
	    public String getDOB() { return DOB; }
	    public String getCity() { return city; }

	    public static void main(String[] args) {
	        studentManager();
	    }
	}
