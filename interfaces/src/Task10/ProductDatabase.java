package Task10;

// ***************
// *** Task 10 ***
// ***************

import java.util.Optional;

public interface ProductDatabase {
    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
