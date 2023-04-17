package Task13_18;

// ********************
// *** Task 13 - 17 ***
// ********************

import java.util.List;
import java.util.Optional;

public interface BookReader {
    boolean addBook(Book book);
    boolean removeBook(Book book);
    void showLibrary();
    Optional<List<Book>> findByAuthor(String author);

    Optional<List<Book>> findByTitle(String title);
}