package Task2;

import java.io.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Random;

public class Employee {
    private String fullName;
    private int salary;
    private LocalDate salaryDate;

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
    }

    public Employee(String fullName,
                    int salary ) {
        this.fullName = fullName;
        this.salary = salary;
        this.salaryDate = LocalDate.now();
    }

    public static LinkedList<Employee> generateRandomEmployees(final int quantity) {
        String[] names = {"Victor", "Tom", "john", "Nestor",
                        "Alexa", "Irina", "Olga", "Viki"};
        String[] surname = {"Hugo", "Edison", "Thompson", "Johnson",
                        "Hour", "Lauren", "Duran", "Mayer"};
        final int maxSalary = 50; // in thouthends
        final int minSalary = 2000;
        Random rnd = new Random();
        LinkedList<Employee> employees = new LinkedList<>();
        for(int count = 0; count < quantity; count++) {
            int nameIndex = rnd.nextInt(names.length);
            int surnameIndex = rnd.nextInt(surname.length);
            int salary = minSalary + rnd.nextInt(maxSalary) * 1000;
            employees.add(new Employee(names[nameIndex]
                    + " "
                    + surname[surnameIndex], salary));
        }
        return employees;
    }

    public static boolean saveReport(Statistics report,
                                     LinkedList<Employee> employees) throws IOException {
        FileWriter file = new FileWriter("report.txt");
        try(PrintWriter output = new PrintWriter(file, true)) {
            output.println(report.getReport(employees));
        } catch (Exception e) {
            System.out.println("Error occurred " + e.getMessage());
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", salaryDate=" + salaryDate +
                '}';
    }
}