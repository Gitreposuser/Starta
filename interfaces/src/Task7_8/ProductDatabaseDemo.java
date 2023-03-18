package Task7_8;

// ******************
// *** Task 7 - 8 ***
// ******************

public class ProductDatabaseDemo {
    public static void main(String[] args) {
        String [] products = {"butter", "eggs", "bread", "fish", "cake",
                "cabbage"};
        InMemoryDatabase database = new InMemoryDatabase();

        for(String prod: products) {
            database.save(new Product(prod));
        }

        Product eggs = database.findByTitle("eggs");
        System.out.println("Eggs found: " + eggs.getTitle());

        Product alien = database.findByTitle("alien");
        if(alien == null) {
            System.out.println("Alien is null...");
        } else {
            System.out.println("Alien found: " + alien.getTitle());
        }
    }
}