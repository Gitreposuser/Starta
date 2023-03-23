package Task1;

import java.util.Objects;
import java.util.Random;

public class Student {
    private static int counter;
    private int id;
    private String name;
    private String group;

    public int getCourse() {
        return course;
    }

    private int course;
    private int[] grades;

    public Student() {
        this.id = ++counter;
    }

    public Student(String name, String group,
                   int course, int[] grades) {
        this.id = counter++;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public void generateRandomStudent(String[] groups) {
        String[] names = {"John", "Shen", "Stephane", "Nicole", "Nikki",
                "Robert", "Grace", "Antony", "Ivan", "Tom"};
        Random rnd = new Random();
        int randomNameIndex = rnd.nextInt(names.length);
        name = names[randomNameIndex];
        int randomGroupIndex = rnd.nextInt(groups.length);
        group = groups[randomGroupIndex];
        final int startedCourse = 1;
        final int finalCourse = 5;
        course =  startedCourse + rnd.nextInt(finalCourse);
        grades = new int[10];
        final int minGrade = 2;
        final int maxGrade = 5;
        for(int index = 0; index < grades.length; index++) {
            grades[index] = minGrade + rnd.nextInt(maxGrade - 1);
        }
    }

    public float getAverageScore() {
        float result = 0;
        for (int grade : grades) {
            result += (float)grade;
        }
        return result / grades.length;
    }

    public void showGrades() {
        for(int grade: grades) {
            System.out.print(grade + ", ");
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name)
                && Objects.equals(group, student.group)
                && Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, group, course);
        return result;
    }
}