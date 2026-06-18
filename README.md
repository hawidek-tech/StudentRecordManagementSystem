# StudentRecordManagementSystem

Project Description

This project is a Student Record Management System developed using Java Object-Oriented Programming (OOP) concepts and Java File I/O.

The system allows users to add, search, update, delete, and display student records. Student data is stored using text files, binary files, and object serialization techniques.

System Design:

The project is divided into five classes:

1. Student.java

This class represents a student object.

Attributes:

- Student ID
- Name
- Department
- GPA

Responsibilities:

- Store student information
- Provide getters and setters
- Support object serialization


2. StudentManager.java

This class manages student records.

Responsibilities:

- Add student
- Search student
- Update student
- Delete student
- Display all students

Student records are stored in an ArrayList.

3. FileManager.java

This class handles all file operations.

Responsibilities:

- Save and load text files
- Save and load binary files
- Save and load serialized objects
- Create files and directories automatically
- Display file properties
- Create backups using buffered streams


4. ReportGenerator.java

This class generates reports.

Responsibilities:

- Calculate total students
- Find highest GPA
- Find lowest GPA
- Calculate average GPA

5. Main.java

This is the main class of the project.

Responsibilities:

- Display menu
- Accept user input
- Call methods from other classes
- Handle exceptions

File I/O Techniques Used

Text Files:-

- Scanner
- PrintWriter

Binary Files:-

- DataInputStream
- DataOutputStream

Object Serialization:-

- ObjectInputStream
- ObjectOutputStream

Buffered Streams:-

- BufferedInputStream
- BufferedOutputStream

File Class:-

- File
- createNewFile()
- mkdir()
- exists()
- length()
- lastModified()

OOP Concepts Used:

- Classes and Objects
- Encapsulation
- Constructors
- ArrayList
- Method Overriding
- Serialization

Features:-

- Add Student
- Search Student
- Update Student
- Delete Student
- Display Students
- Save to Text File
- Save to Binary File
- Save Serialized File
- Generate Reports
- Create Backup
- Display File Properties
- Exception Handling

How to Run:-

1. Compile all Java files.
2. Run Main.java.
3. Select menu options to manage student records.
