package gov.newworldorder.Service;


import gov.newworldorder.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gov.newworldorder.DAO.FakeBookDB;

import java.util.Collection;

@Service
public class BookService {

    @Autowired
    private FakeBookDB fakeBookDB;

    public Collection<Book> getAllBooks() {
        return this.fakeBookDB.getAllBooks();
    }

    public Book getBookById(int id) {
        return this.fakeBookDB.getBookById(id);
    }

    public Book removeBookById(int id) {
        return this.fakeBookDB.removeBookById(id);
    }

    public Book updateBook(Book Book) {
        return this.fakeBookDB.updateBook(Book);
    }

    public Book insertBook(Book Book) {
        return this.fakeBookDB.insertBook(Book);
    }
}
