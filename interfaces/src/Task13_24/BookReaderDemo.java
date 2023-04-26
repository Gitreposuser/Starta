package Task13_24;

import utils.ConsoleColors;

import java.util.List;

// ********************
// *** Task 13 - 24 ***
// ********************

public class BookReaderDemo {
    public static void main(String[] args) {
        final Book[] books = new Book[] {
                new Book("Arthur Wild", "Gemini"),
                new Book("Arthur Bold", "Octangle"),
                new Book("Arthur Wild", "Gemini"),
                new Book("Arthur Mars", "Peace"),
                new Book("Arthur Wild", "Marble"),
                new Book("Arthur Wild", "Pigeon"),
                new Book("Ar", null),
                new Book(null, null),
                new Book(null, "titl"),
                new Book("", "")
        };
        BookReader reader = new BookReaderImpl();

        // Add books
        for(Book book: books) {
            boolean opResult = reader.addBook(book);
            if(opResult) {
                System.out.print(ConsoleColors.GREEN + book + " added " + true);
            } else {
                System.out.print(ConsoleColors.RED + book + " added " + false);
            }
        }
        System.out.println(ConsoleColors.RESET + "");

        // Removing book
        Book toRemove = new Book("Arthur Bold", "Octangle");
        boolean res = reader.removeBook(toRemove);
        System.out.println(toRemove + " removed " + res);
        reader.showLibrary();

        // Searching books by author
        List<Book> booksWithSameAuthor;
        String author = "Arthur Wild";
        booksWithSameAuthor = reader.findByAuthor(author).get();
        System.out.println(" Found by author: " + author);
        System.out.println(ConsoleColors.YELLOW + booksWithSameAuthor);
        System.out.println(ConsoleColors.RESET + "");

        // Searching books by partial author name
        List<Book> booksWithPartialAuthor;
        String partialAuthor = "Art";
        booksWithPartialAuthor = reader.findByAuthor(partialAuthor).get();
        System.out.println(" Found by author: " + partialAuthor);
        System.out.println(ConsoleColors.YELLOW + booksWithPartialAuthor);
        System.out.println(ConsoleColors.RESET + "");

        // Searching books by title
        List<Book> booksWithSameTitle;
        String title = "Peace";
        booksWithSameTitle = reader.findByTitle(title).get();
        System.out.println(" Found by title: " + title);
        System.out.println(ConsoleColors.YELLOW + booksWithSameTitle);
        System.out.println(ConsoleColors.RESET + "");

        // Searching books by partial title
        List<Book> booksWithPartialTitle;
        String partialTitle = "Pea";
        booksWithPartialTitle = reader.findByTitle(partialTitle).get();
        System.out.println(" Found by partial title: " + partialTitle);
        System.out.println(ConsoleColors.YELLOW + booksWithPartialTitle);
        System.out.println(ConsoleColors.RESET + "");

        // Marked book as read
        System.out.print(" Mark book: " + books[0] +
                " as read = " + reader.setAsRead(books[0]));
        System.out.println(books[0] + " is read = " + books[0].isRead());

        // Show all read books
        System.out.println("\n List of read books: ");
        System.out.println(reader.getAllReadBooks().get());

        // Show all unread books
        System.out.println("\n List of unread books: ");
        System.out.println(reader.getAllUnreadBooks().get());
    }
}