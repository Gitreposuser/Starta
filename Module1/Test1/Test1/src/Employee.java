import java.time.LocalDate;

public abstract class Employee extends Person{
    protected LocalDate hiringDate;
    public Employee(String firstName,
                    String lastName,
                    int age,
                    LocalDate hiringDate) {
        super(firstName, lastName, age);
        this.hiringDate = hiringDate;
    }

    public void work() {
        System.out.println("Abstract worker");
    }
}