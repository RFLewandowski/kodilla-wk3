package gov.newworldorder.DAO;


import gov.newworldorder.Entity.Book;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class FakeBookDB {

    private static Map<Integer, Book> books;

    static {
        Book theBook1 = new Book(1, "Assassins' Creed the Book", "William Shakespeare", 2016);
        Book theBook2 = new Book(2, "Book of jungle", "Rudyard Kipling", 1894);
        Book theBook3 = new Book(3, "50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572);
        Book theBook4 = new Book(4, "Book Of Magic", "Merlin", 111);
        Book theBook5 = new Book(5, "Test book", "Test author", 999);

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
        return this.books.values(); //TODO czemu nie działa return this.getAllBooks() ?
    }


    public Book getBookById(int id) {
        return this.books.get(id); //TODO Intelij nie popdowiedziało books - pewnie dlatego ze są prywatne i nawet tutaj powinno się używać getterów
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
