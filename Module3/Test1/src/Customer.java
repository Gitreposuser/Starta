import java.time.LocalDate;
import java.util.LinkedList;

public class Customer {
    private ShoppingHistory history;

    public Customer() {
        history = new ShoppingHistory();
    }

    public void generateShoppingHistory() {
        LinkedList<Product> products;
        final int shoppingTimes = 10;
        for(int counter = 0; counter < shoppingTimes; counter++) {
            products = ProductGenerator.generateMultiplePurchase(
                    ProductGenerator.generatePurchaseDate(), 10);
            history.addToHistory(products);
        }
    }

    public void getLastPurchases(LocalDate fromDate, int interval) {

    }
}