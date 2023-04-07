import java.util.LinkedList;
import java.util.List;

public class ShoppingDemo {
    public static void main(String[] args) {
        List<Customer> clients =new LinkedList<>();
        Customer client;
        // Generate customers with some shoppingHistory
        final int clientsQuantity = 10;
        for(int quantity = 0; quantity < clientsQuantity; quantity++) {
            client = new Customer();
            client.generateShoppingHistory();
            clients.add(client);
        }
        // Get shopping history for last 30 days of each customer
        for(Customer customer: clients) {
            //customer.
        }
    }
}