import java.time.LocalTime;
import java.util.Map;
import java.util.TreeMap;

public class Agenda {
    Map<LocalTime, String> list;
    public Agenda() {
        list = new TreeMap<>();
    }

    public void addAppointment() {
        LocalTime time = UI.getTime();
        String name = UI.getName();
        if(list.containsKey(time)) {
            System.out.println("This time window already occupied");
            System.out.println("Try another time");
            addAppointment();
        }
        list.put(time, name);
    }

    public void showAgenda() {
        System.out.println(" Agenda for today: ");
        for(Map.Entry<LocalTime, String> element: list.entrySet()) {
            System.out.println("time : " + element.getKey()
                    + " name " + element.getValue());
        }
    }
}