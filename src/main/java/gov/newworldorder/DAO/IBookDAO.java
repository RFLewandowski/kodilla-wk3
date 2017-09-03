package gov.newworldorder.DAO;

import gov.newworldorder.Entity.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Transactional
public interface IBookDAO {

    Collection<Book> getAllBooks();

    Book getBookById(int id);

    Book removeBookById(int id);

    Book updateBook(Book newBook);

    Book insertBook(Book book);
}
