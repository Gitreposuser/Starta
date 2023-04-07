import java.time.LocalDate;

public class QaSpecialist extends Employee{
    private String teamRole;
    public QaSpecialist(String firstName,
                        String lastName,
                        int age,
                        LocalDate hiringDate,
                        String teamRole) {
        super(firstName, lastName, age, hiringDate);
        this.teamRole = teamRole;
    }


    @Override
    public void work() {
        System.out.println(this.firstName
                + " "  + this.lastName
                + " responsible of: "
                + teamRole
                + "\n hired: "
                + hiringDate
                + " age - "
                + getAge());
    }
}
