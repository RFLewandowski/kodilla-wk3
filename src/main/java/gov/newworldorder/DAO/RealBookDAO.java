package gov.newworldorder.DAO;

import gov.newworldorder.Entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.Map;

@Transactional
@Repository
@Qualifier("realData")
public class RealBookDAO implements IBookDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Collection<Book> getAllBooks() {
        String hql = "FROM Article as atcl ORDER BY atcl.articleId";
        return (Map<Integer, Book>) entityManager.createQuery(hql).getResultList();
    }

    @Override
    public Book getBookById(int id) {
        return entityManager.find(Book.class,id);
    }

    @Override
    public Book removeBookById(int id) {
        return null;
    }

    @Override
    public Book updateBook(Book newBook) {
        return null;
    }

    @Override
    public Book insertBook(Book book) {
        return null;
    }
}