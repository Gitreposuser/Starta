import java.util.Scanner;

public class LineToDoctorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        do {
            agenda.addAppointment();
            System.out.println("type exit for end");
        } while (!sc.nextLine().equals("exit"));
        agenda.showAgenda();
    }
}