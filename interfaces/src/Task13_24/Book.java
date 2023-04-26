package Task13_24;

// ********************
// *** Task 13 - 24 ***
// ********************

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Book {
    private String author;
    private String title;

    private boolean isRead;
    private String text;

    public boolean isRead() {
        return isRead;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.isRead = false;
        this.text = "";
    }

    public boolean isInvalid() {
        if(author == null || author == "") {
            return true;
        }
        if(title == null || title == "") {
            return true;
        }
        return false;
    }

    public boolean hasSameName(String author) {
        if(author == this.author) {
            return true;
        }
        return false;
    }

    public boolean hasPartialName(String partAuthor) {
        Pattern pattern = Pattern.compile(partAuthor + ".*");
        Matcher matcher = pattern.matcher(this.author);
        if(matcher.find()) {
            return true;
        }
        return false;
    }

    public boolean hasSameTitle(String title) {
        if(title == this.title) {
            return true;
        }
        return false;
    }

    public boolean hasPartialTitle(String title) {
        Pattern pattern = Pattern.compile(title + ".*");
        Matcher matcher = pattern.matcher(this.title);
        if(matcher.find()) {
            return true;
        }
        return false;
    }

    public void setAsRead() {
        isRead = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!author.equals(book.author)) return false;
        return title.equals(book.title);
    }

    @Override
    public int hashCode() {
        int result = author.hashCode();
        result = 31 * result + title.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "\nBook " + title +
                " [" + author + "]";
    }
}