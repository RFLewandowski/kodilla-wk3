package gov.newworldorder.Service;


import gov.newworldorder.DAO.IBookDAO;
import gov.newworldorder.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {

    private final IBookDAO bookDAO;

    @Autowired
    public BookService(@Qualifier("realData") IBookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public Collection<Book> getAllBooks() {
        return this.bookDAO.getAllBooks();
    }

    public Book getBookById(int id) {
        return this.bookDAO.getBookById(id);
    }

    public Book removeBookById(int id) {
        return this.bookDAO.removeBookById(id);
    }

    public Book updateBook(Book book) {
        return this.bookDAO.updateBook(book);
    }

    public Book insertBook(Book book) {
        return this.bookDAO.insertBook(book);
    }
}
