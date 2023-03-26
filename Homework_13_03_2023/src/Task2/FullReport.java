package Task2;

import java.util.Formatter;
import java.util.LinkedList;

public class FullReport implements Statistics{
    public void generateReport(LinkedList<Employee> employees) {
        Formatter form = new Formatter();
        for(Employee emp: employees) {
            form.format(" name = %-15s   salary : %10.2f  date : %-3s \n",
                    emp.getFullName(),
                    (float)emp.getSalary(),
                    emp.getSalaryDate());
        }
        System.out.print(form);
    }

    public StringBuilder getReport(LinkedList<Employee> employees) {
        StringBuilder report = new StringBuilder();
        for(Employee emp: employees) {
            String employeeData = "name = "
                    + emp.getFullName()
                    + " salary : "
                    + emp.getSalary()
                    + " salary date : "
                    + emp.getSalaryDate()
                    + "\n";
            report.append(employeeData);
        }
        return report;
    }
}
