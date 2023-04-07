import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Random;

public class ProductGenerator {
    private static final String[] productNames = {"meat", "bread", "butter",
            "melon", "egg", "fish", "strawberry", "cheese"};

    public static LocalDate generatePurchaseDate() {
        Random rnd = new Random();
        final int currentYear = 2023;
        final int startMonth = 1;
        final int endMonth = 3;
        final int startDate = 1;
        final int endDate = 28;
        int randomMonth = startMonth + rnd.nextInt(endMonth);
        int randomDate = startDate + rnd.nextInt(endDate);
        LocalDate date = LocalDate.of(currentYear, randomMonth, randomDate);
        return date;
    }

    public static Product generatePurchase(LocalDate purchaseDate) {
        // Generating product name
        Random rnd = new Random();
        String productName = productNames[rnd.nextInt(productNames.length)];
        Product product = new Product(productName);

        // Generating product purchase time
        final int startTime = 8;
        final int endTime = 20;
        int hour = startTime + rnd.nextInt(endTime - startTime);
        final int maxMinutes = 59;
        int minutes = rnd.nextInt(maxMinutes);
        LocalTime time = LocalTime.of(hour, minutes);
        product.setPurchaseTime(time);
        product.setPurchaseDate(purchaseDate);
        return product;
    }

    public static LinkedList<Product> generateMultiplePurchase(LocalDate purchasesDate,
                                                               int maxPurchases) {
        LinkedList<Product> products = new LinkedList<>();
        Random rnd = new Random();
        final int minProducts = 1;
        int productsQuantity = minProducts
                + rnd.nextInt(maxPurchases - minProducts);
        for (int product = 0; product < productsQuantity; product++) {
            products.add(generatePurchase(purchasesDate));
        }
        return products;
    }
}