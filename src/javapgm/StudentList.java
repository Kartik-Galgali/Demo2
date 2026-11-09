package javapgm;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		int choice = 0;
		
		do {
			System.out.println("\n1: Add Student");
			System.out.println("2: View Student");
			System.out.println("3: Search Student");
			System.out.println("4: Update Student");
			System.out.println("5: Delete Student");
			System.out.println("6: Exit");
			System.out.println("Enter your Choice: ");
			
			if (!sc.hasNextInt()) {
				System.out.println("Invalid Number");
				sc.nextLine();
				continue;
			}
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1: addStudent();
				break;
			case 2: viewStudent();
				break;
			case 3: searchStudent();
				break;
			case 4: updateStudent();
				break;
			case 5: deleteStudent();
				break;
			case 6: System.out.println("Application Closed");;
				break;
			default: System.out.println("Invalid Choice");
				break;
			}
		}while(choice!=6);
		
		sc.close();
	}

	public static void addStudent() {
		
		System.out.print("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		for (Student s : students) {
			if(s.id == id) {
				System.out.println("Student Id already exist");
				return;
			}
		}
		
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		
		students.add(new Student(id, name, age));
		System.out.println("Student Added Successfully");
	}

	public static void viewStudent() {
		if(students.isEmpty()) {
			System.out.println("No Students Added");
			return;
		}
		for (Student s : students) {
			System.out.println(s);
		}
	}

	public static void searchStudent() {
		System.out.println("Enter the ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		for (Student s : students) {
			if(s.id == id) {
				System.out.println(s);
				return;
			}
		}
		System.out.println("Student Not Found");
	}

	public static void updateStudent() {
		System.out.println("Enter the ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		for (Student s : students) {
			if(s.id == id) {
				System.out.println("Enter new Name: ");
				s.name = sc.nextLine();
				
				System.out.println("Enter new Age");
				s.age = sc.nextInt();
				sc.nextLine();

				System.out.println("Student Details Updated Successfully");
				return;
			}
		}
		System.out.println("Student Not Found");
	}

	public static void deleteStudent() {
		System.out.println("Enter the ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0 ; i < students.size(); i++) {
			if(students.get(i).id==id) {
				students.remove(i);
				System.out.println("Student Details Deleted Successfully");
				return;
			}
		}
		System.out.println("Student Not Found");
	}

	
}
