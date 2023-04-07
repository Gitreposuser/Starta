import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate hiringDate = LocalDate.of(2005,
                7, 5);
        Developer dev = new Developer("Vasilij",
                "Vovanskii", 28,
                hiringDate, "java middle");

        hiringDate = LocalDate.of(2010, 3, 7);
        Manager mg = new Manager("Jakov",
                "Krukovskij", 31,
                hiringDate, "AI data gathering");

        hiringDate = LocalDate.of(2013, 1, 4);
        QaSpecialist qa = new QaSpecialist("Nikon",
                "Vishnevkij", 42,
                hiringDate, "project technical data gathering");

        dev.work();
        mg.work();
        qa.work();
    }
}