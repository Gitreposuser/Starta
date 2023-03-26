package Task2;

import java.io.IOException;
import java.util.LinkedList;

public class EmployeeDemo {
    public static void main(String[] args) throws IOException {
        LinkedList<Employee> employees;
        int employeeQuantity = 7;
        employees = Employee.generateRandomEmployees(employeeQuantity);
        for(Employee emp: employees) {
            System.out.println(emp);
        }
        Statistics report;
        //report = new Report();  // Report
        report = new FullReport();  // Or FullReport
        report.generateReport(employees);
        if(Employee.saveReport(report, employees)) {
            System.out.println("Report saved to file successfully");
        } else {
            System.out.println("Error while saving file!");
        }
    }
}
