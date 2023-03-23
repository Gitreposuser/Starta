package Task1;

import java.util.LinkedList;
import java.util.List;

public class UniversityDemo {
    public static void main(String[] args) {
        final String[] groups = {"java41e", "java41e",
                "java40d", "java40d"};
        LinkedList<Student> students;

        // Generate and show students
        System.out.println("\n***** Students *****");
        int numberOfStudents = 10;
        students = getRandomStudents(numberOfStudents, groups);
        for(Student std: students) {
            System.out.println(std);
            std.showGrades();
            System.out.println("average score: " + std.getAverageScore());
        }

        // Show all students st course
        int curCourse = 5;
        System.out.println("\n***** Show all students at the "
                + curCourse
                + " course *****");
        printStudents(students, curCourse);

        // Clear weak students
        System.out.println("\n***** After clearing *****");
        students = deleteStudents(students);
        for(Student std: students) {
            System.out.println(std);
        }
    }

    private static LinkedList<Student> getRandomStudents(int quantity,
                                                         String[] groups) {
        LinkedList<Student> students = new LinkedList<>();
        Student student;
        for(int i = 0; i < quantity; i++) {
            student = new Student();
            student.generateRandomStudent(groups);
            students.add(student);
        }
        return students;
    }
    private static LinkedList<Student> deleteStudents(LinkedList<Student> students) {
        final float filterGrade = 3.0F;
        students.removeIf(s -> s.getAverageScore() < filterGrade);
        return students;
    }

    private static void printStudents(List<Student> students, int course) {
        students.stream()
                .filter(s -> s.getCourse() == course)
                .forEach(System.out::println);
    }
}