package Task13_24;

// ********************
// *** Task 13 - 24 ***
// ********************

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BookReaderImpl implements BookReader {
    private ELibrary library;

    public ELibrary getLibrary() {
        return library;
    }

    public BookReaderImpl() {
        this.library = new ELibrary();
    }

    public void showLibrary() {
        library.showLibrary();
    }

    @Override
    public Optional<List<Book>> findByAuthor(String author) {
        if(author == null || author == "") {
            return Optional.empty();
        }

        List<Book> books = new LinkedList<>();
        for(Book curBook: library.getBooks()) {
            if(curBook.hasSameName(author) ||
                curBook.hasPartialName(author)) {
                books.add(curBook);
            }
        }
        return Optional.of(books);
    }

    @Override
    public Optional<List<Book>> findByTitle(String title) {
        if(title == null || title == "") {
            return Optional.empty();
        }

        List<Book> books = new LinkedList<>();
        for(Book curBook: library.getBooks()) {
            if(curBook.hasSameTitle(title) ||
                    curBook.hasPartialTitle(title)) {
                books.add(curBook);
            }
        }
        return Optional.of(books);
    }

    @Override
    public boolean setAsRead(Book book) {
        if(!library.contains(book)) {
            return false;
        }
        book.setAsRead();
        return true;
    }

    @Override
    public Optional<List<Book>> getAllReadBooks() {
        List<Book> readBooks = new LinkedList<>();
        for(Book book: library.getBooks()) {
            if(book.isRead()) {
                readBooks.add(book);
            }
        }
        return Optional.of(readBooks);
    }

    @Override
    public Optional<List<Book>> getAllUnreadBooks() {
        List<Book> unreadBooks = new LinkedList<>();
        for(Book book: library.getBooks()) {
            if(!book.isRead()) {
                unreadBooks.add(book);
            }
        }
        return Optional.of(unreadBooks);
    }

    @Override
    public boolean addBook(Book book) {
        if(book.isInvalid()) {
            return false;
        }
        if(library.contains(book)) {
            return false;
        }
        library.addBook(book);
        return true;
    }

    @Override
    public boolean removeBook(Book book) {
        if(book.isInvalid()) {
            return false;
        }
        if(library.contains(book)) {
            library.removeBook(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookReaderImpl that = (BookReaderImpl) o;

        return Objects.equals(library, that.library);
    }

    @Override
    public int hashCode() {
        return library != null ? library.hashCode() : 0;
    }
}