
package javapgm;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentPgm {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        int choice=0;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            if (!sc.hasNextInt()) {
				System.out.println("Please Enter valid number");
				sc.nextLine();
				continue;
			}
            
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Application closed.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }

    static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
//        System.in.read(); // ASCII Value
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        students.add(new Student(id, name, age));
        System.out.println("Student added successfully.");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    static void searchStudent() {
        System.out.print("Enter ID to search: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.id == id) {
                System.out.println(s);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void updateStudent() {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.id == id) {
                System.out.print("Enter new name: ");
                s.name = sc.nextLine();

                System.out.print("Enter new age: ");
                s.age = sc.nextInt();
                sc.nextLine();

                System.out.println("Student updated.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                System.out.println("Student deleted.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
