import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShoppingHistory {
    private Map<LocalDate, List<Product>> history;

    public ShoppingHistory() {
        this.history = new HashMap<>();
    }

    public void addToHistory(List<Product> products) {
        history.put(products.get(0).getPurchaseDate(), products);
    }

    public void showLastPurchases(LocalDate fromDate, int interval) {
        LocalDate toDate = fromDate.plusDays(interval);

        history.keySet().stream()
            .filter(date -> date.isAfter(fromDate) && date.isBefore(toDate))
            .map(productList -> history.get(productList))
            .flatMap(List::stream)
            .map(el -> el.getProductName())
            .sorted()
            .distinct()
            .forEachOrdered(p -> {
                System.out.println(p);
            });
    }

    public void showAllShoppingDays() {
        System.out.println(history.keySet());
    }
    public void showAllPurchases() {
        System.out.println(history.values());
    }
}