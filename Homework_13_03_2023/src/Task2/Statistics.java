package Task2;

import java.util.LinkedList;

public interface Statistics {
    public void generateReport(LinkedList<Employee> employees);
    public StringBuilder getReport(LinkedList<Employee> employees);
}
