package gov.newworldorder.DAO;


import gov.newworldorder.Entity.Author;
import gov.newworldorder.Entity.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
@Qualifier("fakeData")
public class FakeBookDAO implements IBookDAO {

    private static Map<Integer, Book> books;

    @PostConstruct
    public void init() {

        Author a1 = new Author("William Shakespeare");
        Author a2 = new Author("Rudyard Kipling");
        Author a3 = new Author("Dante Alighieri");
        Author a4 = new Author("Merlin");
        Author a5 = new Author("Test author");

        Book theBook1 = new Book(1, "Assassins' Creed the Book", a1, 2016);
        Book theBook2 = new Book(2, "Book of jungle", a2, 1894);
        Book theBook3 = new Book(3, "50 shades of gray - lexicon for graphicians", a3, 1572);
        Book theBook4 = new Book(4, "Book Of Magic", a4, 111);
        Book theBook5 = new Book(5, "Test book", a5, 999);

        books = new HashMap<Integer, Book>() {
            {
                put(1, theBook1);
                put(2, theBook2);
                put(3, theBook3);
                put(4, theBook4);
                put(5, theBook5);
            }
        };
    }


    public Collection<Book> getAllBooks() {
        return this.books.values();
    }

    public Book getBookById(int id) {
        return this.books.get(id);
    }

    public Book removeBookById(int id) {
        return this.books.remove(id);
    }


    public Book updateBook(Book newBook) {
        Book originalBook = books.get(newBook.getID());
        originalBook.setTitle(newBook.getTitle());
        originalBook.setAuthor(newBook.getAuthor());
        originalBook.setYear(newBook.getYear());

        return newBook;
    }

    public Book insertBook(Book book) {
        return this.books.put(book.getID(), book);
    }
}
