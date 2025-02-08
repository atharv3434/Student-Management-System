import java.util.ArrayList;
import java.util.Scanner;

// Student class
class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    // Constructor
    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Display student details
    public void displayStudent() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

// Main Class
public class StudentManagementSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n----- Student Management System -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> addStudent();
                case 2 -> displayStudents();
                case 3 -> searchStudent();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> {
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Add a new student
    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Student Grade: ");
        String grade = scanner.nextLine();

        students.add(new Student(id, name, age, grade));
        System.out.println("Student added successfully!");
    }

    // Display all students
    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\n----- Student List -----");
        for (Student s : students) {
            s.displayStudent();
        }
    }

    // Search for a student by ID
    private static void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student found:");
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Update student details
    private static void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter new grade: ");
                String grade = scanner.nextLine();

                s.setName(name);
                s.setAge(age);
                s.setGrade(grade);
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Delete a student
    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
