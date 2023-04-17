package Task13_18;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

// ********************
// *** Task 13 - 17 ***
// ********************

public class ELibrary {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public ELibrary() {
        books = new LinkedList<>();
    }

    public boolean contains(Book book) {
        if(books.contains(book)) {
            return true;
        }
        return false;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void showLibrary() {
        System.out.println("Book reader library: ");
        System.out.println(books);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ELibrary eLibrary = (ELibrary) o;

        return Objects.equals(books, eLibrary.books);
    }

    @Override
    public int hashCode() {
        return books != null ? books.hashCode() : 0;
    }
}