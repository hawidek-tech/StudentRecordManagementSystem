
public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public Student searchStudent(String id) {

        for (Student student : students) {

            if (student.getStudentId().equals(id)) {
                return student;
            }
        }

        return null;
    }

    public boolean updateStudent(String id,
                                 String name,
                                 String department,
                                 double gpa) {

        Student student = searchStudent(id);

        if (student != null) {

            student.setName(name);
            student.setDepartment(department);
            student.setGpa(gpa);

            return true;
        }

        return false;
    }

    public boolean deleteStudent(String id) {

        Student student = searchStudent(id);

        if (student != null) {

            students.remove(student);
            return true;
        }

        return false;
    }

    public void displayStudents() {

        if (students.isEmpty()) {

            System.out.println("No student records found.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }
}