package Task13_24;

// ********************
// *** Task 13 - 24 ***
// ********************

import java.util.List;
import java.util.Optional;

public interface BookReader {
    boolean addBook(Book book);

    boolean removeBook(Book book);

    void showLibrary();

    Optional<List<Book>> findByAuthor(String author);

    Optional<List<Book>> findByTitle(String title);

    boolean setAsRead(Book book);

    Optional<List<Book>> getAllReadBooks();

    Optional<List<Book>> getAllUnreadBooks();
}