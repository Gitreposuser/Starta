package Task7;

// **************
// *** Task 7 ***
// **************

// This interface isn't a @FunctionalInterface
// Because he declares two methods
// Functional interface can consist only of one method!
// If we mark this interface as functional
// Compiler will show us an error

// Uncomment to verify
//@FunctionalInterface
public interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
}
