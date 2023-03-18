package Task7_8;

// **************
// *** Task 7 ***
// **************

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InMemoryDatabaseTest {
    @Test
    void saveTest() {
        InMemoryDatabase actualDatabase = new InMemoryDatabase();
        Product actualProd = new Product("butter");
        actualDatabase.save(actualProd);

        Product expectedProd = new Product("butter");

        String expectedValue = expectedProd.getTitle();
        String actualValue = actualDatabase
                .findByTitle("butter")
                .getTitle();

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void findByTitleTest() {
        InMemoryDatabase database = new InMemoryDatabase();
        String [] names = {"1", "2", "3", "4", "5", "6", "7"};

        for(String name: names) {
            database.save(new Product(name));
        }

        String expectedProduct = new Product("7").getTitle();
        String actualProduct = database.findByTitle("7").getTitle();

        Assertions.assertEquals(expectedProduct, actualProduct);
    }
}