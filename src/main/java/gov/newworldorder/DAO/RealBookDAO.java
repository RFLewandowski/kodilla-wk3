package gov.newworldorder.DAO;

import gov.newworldorder.Entity.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

@Transactional
@Repository
@Qualifier("realData")
public class RealBookDAO implements IBookDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public Collection<Book> getAllBooks() {
        String hql = "FROM Book as book ORDER BY book.ID";
        return (List<Book>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Book getBookById(int id) {
        return entityManager.find(Book.class, id);
    }

    @Override
    public Book removeBookById(int id) {
        entityManager.remove(getBookById(id));
        return null;
    }

    @Override
    public Book updateBook(Book newBook) {
        Book originalBook = getBookById(newBook.getID());
        originalBook.setTitle(newBook.getTitle());
        originalBook.setAuthor(newBook.getAuthor());
        originalBook.setYear(newBook.getYear());
        entityManager.flush();
        return null;
    }

    @Override
    public Book insertBook(Book book) {
        entityManager.merge(book);
        return null;
    }
}