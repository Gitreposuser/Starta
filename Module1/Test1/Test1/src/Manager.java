import java.time.LocalDate;

public class Manager extends Employee {
    private String leadingDepartment;

    public Manager(String firstName,
                   String lastName,
                   int age,
                   LocalDate hiringDate,
                   String leadingDepartment) {
        super(firstName, lastName, age, hiringDate);
        this.leadingDepartment = leadingDepartment;
    }


    @Override
    public void work() {
        System.out.println(this.firstName
                + " "  + this.lastName
                + " manager of: "
                + leadingDepartment
                + "\n hired: "
                + hiringDate
                + " age - "
                + getAge());
    }
}
