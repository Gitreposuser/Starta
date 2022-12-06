public class Main {
    public static void main(String[] args) {

        Employee Helen = new Employee("Helen", 25, "Engineer", 3000.15);
        Helen.showEmployeeStats();
        Helen.increaseSalary();
        Helen.showEmployeeStats();
    }
}