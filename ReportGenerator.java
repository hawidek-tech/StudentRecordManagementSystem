
public class ReportGenerator {

    public static void generateReport(ArrayList<Student> students) {

        if (students.isEmpty()) {

            System.out.println("No student records available.");
            return;
        }

        int totalStudents = students.size();

        Student highestStudent = students.get(0);
        Student lowestStudent = students.get(0);

        double sum = 0;

        for (Student student : students) {

            if (student.getGpa() > highestStudent.getGpa()) {
                highestStudent = student;
            }

            if (student.getGpa() < lowestStudent.getGpa()) {
                lowestStudent = student;
            }

            sum += student.getGpa();
        }

        double averageGpa = sum / totalStudents;

        System.out.println("\n========= REPORT =========");
        System.out.println("Total Students : " + totalStudents);

        System.out.println(
                "Highest GPA : "
                        + highestStudent.getGpa()
                        + " (" + highestStudent.getName() + ")"
        );

        System.out.println(
                "Lowest GPA : "
                        + lowestStudent.getGpa()
                        + " (" + lowestStudent.getName() + ")"
        );

        System.out.printf("Average GPA : %.2f%n", averageGpa);

        System.out.println("==========================");
    }
}