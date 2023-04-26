package Task13_24;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class BookReaderImplTest {
    final Book[] books = new Book[] {
            new Book("Arthur Wild", "Gemini"),      // 0
            new Book("Arthur Bold", "Octangle"),    // 1
            new Book("Arthur Wild", "Gemini"),      // 2
            new Book("Arthur Mars", "Peace"),       // 3
            new Book("Arthur Wild", "Marble"),      // 4
            new Book("Ar", null),
            new Book(null, null),
            new Book(null, "titl"),
            new Book("", ""),
            new Book("", null),
            new Book(null, ""),
            new Book("Ar", ""),
            new Book("", "An"),
    };

    @Test
    void addBookPositive() {
        BookReader reader = new BookReaderImpl();
        boolean expectedValue = true;
        boolean actualValue = reader.addBook(books[0]);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void addMultipleBooksPositive() {
        BookReader reader = new BookReaderImpl();
        int endIndex = 5;
        boolean[] expectedValues = {true, true, false, true, true};
        boolean[] actualValues = new boolean[endIndex];

        for (int i = 0; i < endIndex; i++) {
            actualValues[i] = reader.addBook(books[i]);
        }
        Assertions.assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    void addMultipleBooksNegative() {
        BookReader reader = new BookReaderImpl();
        reader.addBook(books[0]);
        boolean expectedValue = false;
        boolean actualValue = reader.addBook(books[2]);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void addWithNullAndEmptyValues() {
        BookReader reader = new BookReaderImpl();
        boolean[] expectedValues = {true, true, false, true, true,
                false, false, false, false, false,
                false, false, false
        };
        boolean[] actualValues = new boolean[books.length];

        for (int i = 0; i < books.length; i++) {
            actualValues[i] = reader.addBook(books[i]);
        }
        Assertions.assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    void removeWithNullAndEmptyValuesPositive() {
        BookReader reader = new BookReaderImpl();
        for (Book book: books) {
            reader.addBook(book);
        }
        boolean[] expectedValues = {true, true, false, true, true,
                false, false, false, false, false,
                false, false, false};
        boolean[] actualValues = new boolean[books.length];

        for (int i = 0; i < books.length; i++) {
            actualValues[i] = reader.removeBook(books[i]);
        }
        Assertions.assertArrayEquals(expectedValues, actualValues);
    }

    @Test
    void removeBookPositive() {
        BookReader reader = new BookReaderImpl();
        reader.addBook(books[0]);
        boolean expectedValue = true;
        boolean actualValue = reader.removeBook(books[0]);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void removeBookNegative() {
        BookReader reader = new BookReaderImpl();
        reader.addBook(books[0]);
        boolean expectedValue = false;
        boolean actualValue = reader.removeBook(books[1]);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void findByAuthor() {
        List<Book> expectedList = new LinkedList<>();
        expectedList.add(books[0]);
        expectedList.add(books[4]);

        BookReader reader = new BookReaderImpl();
        reader.addBook(books[2]);
        reader.addBook(books[4]);
        reader.addBook(books[1]);
        reader.addBook(books[3]);
        reader.addBook(books[4]);
        List<Book> actualList = reader.findByAuthor("Arthur Wild").get();

        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void findByAuthorEmptyList() {
        List<Book> expectedList = new ArrayList<>();

        BookReader reader = new BookReaderImpl();
        reader.addBook(books[0]);
        reader.addBook(books[4]);
        reader.addBook(books[1]);
        reader.addBook(books[3]);
        reader.addBook(books[4]);
        List<Book> actualList = reader.findByAuthor("Nikola Wild").get();

        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void findByPartialNamePositive() {
        List<Book> expectedList = new LinkedList<>();
        expectedList.add(books[0]);
        expectedList.add(books[4]);
        expectedList.add(books[1]);
        expectedList.add(books[3]);

        BookReader reader = new BookReaderImpl();
        reader.addBook(books[0]);
        reader.addBook(books[4]);
        reader.addBook(books[1]);
        reader.addBook(books[3]);
        reader.addBook(books[4]);
        List<Book> actualList = reader.findByAuthor("Art").get();

        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void findByPartialLastNamePositive() {
        List<Book> expectedList = new LinkedList<>();
        expectedList.add(books[3]);

        BookReader reader = new BookReaderImpl();
        reader.addBook(books[0]);
        reader.addBook(books[4]);
        reader.addBook(books[1]);
        reader.addBook(books[3]);
        reader.addBook(books[4]);
        List<Book> actualList = reader.findByAuthor("Mar").get();

        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void setAsReadNegative() {
        BookReader reader = new BookReaderImpl();
        reader.addBook(books[0]);
        reader.addBook(books[4]);
        reader.addBook(books[1]);
        reader.addBook(books[3]);
        reader.addBook(books[4]);

        boolean expectedValue = false;
        boolean actualValue = reader.setAsRead(new Book("some title",
                "some author"));
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void setAsReadPositive() {
        BookReader reader = new BookReaderImpl();
        reader.addBook(books[0]);
        reader.addBook(books[4]);
        reader.addBook(books[1]);
        reader.addBook(books[3]);
        reader.addBook(books[4]);

        boolean expectedValue = true;
        boolean actualValue = reader.setAsRead(books[1]);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void getReadBooksPositive() {
        List<Book> expectedValues = new LinkedList<>();
        expectedValues.add(books[0]);
        expectedValues.add(books[1]);

        BookReader reader = new BookReaderImpl();
        reader.addBook(books[0]);
        reader.addBook(books[4]);
        reader.addBook(books[1]);
        reader.addBook(books[3]);
        reader.addBook(books[4]);

        reader.setAsRead(books[0]);
        reader.setAsRead(books[1]);

        List<Book> actualValues = new LinkedList<>();
        actualValues.addAll(reader.getAllReadBooks().get());

        Assertions.assertEquals(expectedValues, actualValues);
    }

    @Test
    void getReadBooksNegative() {
        List<Book> expectedValues = new LinkedList<>();
        expectedValues.add(books[1]);
        expectedValues.add(books[3]);

        BookReader reader = new BookReaderImpl();
        reader.addBook(books[0]);
        reader.addBook(books[4]);
        reader.addBook(books[1]);
        reader.addBook(books[3]);
        reader.addBook(books[4]);

        reader.setAsRead(books[0]);
        reader.setAsRead(books[4]);

        List<Book> actualValues = new LinkedList<>();
        actualValues.addAll(reader.getAllUnreadBooks().get());

        Assertions.assertEquals(expectedValues, actualValues);
    }
}