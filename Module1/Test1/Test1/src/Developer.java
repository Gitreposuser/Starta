import java.time.LocalDate;

public class Developer extends Employee {
    private String roleName;

    public Developer(String firstName,
                     String lastName,
                     int age,
                     LocalDate hiringDate,
                     String roleName) {
        super(firstName, lastName, age, hiringDate);
        this.roleName = roleName;
    }

    @Override
    public void work() {
        System.out.println(this.firstName
                + " "  + this.lastName
                + " Developer: "
                + roleName
                + "\n hired: "
                + hiringDate
                + " age - "
                + getAge());
    }
}