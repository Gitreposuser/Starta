package Task10;

// ***************
// *** Task 10 ***
// ***************

import java.util.Optional;

public class InMemoryDatabase implements ProductDatabase {
    private Product[] products;

    @Override
    public void save(Product product) {
        if(products == null) {
            products = new Product[1];
        } else {
            Product[] buffer = products;
            products = new Product[products.length + 1];
            System.arraycopy(buffer, 0,
                    products, 0, buffer.length);
        }
        products[products.length - 1] = product;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for(Product prod: products) {
            if(prod.getTitle() == productTitle) {
                return Optional.of(prod);
            }
        }
        return Optional.of(new Product("default product"));
    }
}