# Student-Management-System

📌 Project: Student Management System (Java-Only)
🔹 Description
The Student Management System is a Java-based console application that helps manage student records efficiently. This program enables users to add, view, update, search, and delete student details. It is implemented using Object-Oriented Programming (OOP) principles, particularly Encapsulation and Collections (ArrayList).

This system does not require a database; instead, it stores student records dynamically in an ArrayList. The program runs in a menu-driven format, allowing users to interact with it seamlessly through the console.

🔹 Features
✔ Add a Student – Users can enter student details (ID, Name, Age, Grade).
✔ Display All Students – Shows all student records stored in memory.
✔ Search for a Student – Find a student by ID.
✔ Update Student Details – Modify existing student information.
✔ Delete a Student – Remove a student from the system using their ID.
✔ Exit Option – Allows users to terminate the program.

🔹 Technologies Used
Java (Core Java)
Collections Framework (ArrayList)
OOP Concepts (Encapsulation, Constructors, Methods)
Exception Handling (Input Handling with Scanner)
🔹 How It Works?
The program starts by displaying a menu with various options.
Users can select an option (e.g., Add, Search, Update, Delete).
Input is taken through Scanner, and data is stored in an ArrayList<Student>.
The program runs in a loop until the user chooses to exit.
🔹 Sample Output
pgsql
Copy
Edit
----- Student Management System -----
1. Add Student
2. Display Students
3. Search Student by ID
4. Update Student
5. Delete Student
6. Exit
Enter your choice: 1
Enter Student ID: 101
Enter Student Name: Atharv
Enter Student Age: 21
Enter Student Grade: A
Student added successfully!

----- Student Management System -----
1. Add Student
2. Display Students
3. Search Student by ID
4. Update Student
5. Delete Student
6. Exit
Enter your choice: 2

----- Student List -----
ID: 101, Name: Atharv, Age: 21, Grade: A
