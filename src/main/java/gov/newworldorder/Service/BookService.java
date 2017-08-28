package gov.newworldorder.Service;


import gov.newworldorder.DAO.IBookDAO;
import gov.newworldorder.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@Qualifier("fakeData")
public class BookService {

    @Autowired
    private IBookDAO bookDAO;

    public Collection<Book> getAllBooks() {
        return this.bookDAO.getAllBooks();
    }

    public Book getBookById(int id) {
        return this.bookDAO.getBookById(id);
    }

    public Book removeBookById(int id) {
        return this.bookDAO.removeBookById(id);
    }

    public Book updateBook(Book Book) {
        return this.bookDAO.updateBook(Book);
    }

    public Book insertBook(Book Book) {
        return this.bookDAO.insertBook(Book);
    }
}
