import java.time.LocalDate;
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

    public void getLastPurchases(LocalDate fromDate, int interval) {
        history.values().stream()
                .flatMap(p -> p.stream()
                .filter(pr -> {
                    LocalDate toDate = fromDate.plusDays(interval);
                    pr.getPurchaseDate().isBefore(toDate);
                })
                .distinct()
                .forEach(System.out::println));
    }

    public void showAllShoppingDays() {
        System.out.println(history.keySet());
    }
    public void showAllPurchases() {
        System.out.println(history.values());
    }
}