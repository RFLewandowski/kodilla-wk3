package gov.newworldorder.DAO;

import gov.newworldorder.Entity.Author;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

@Repository
public class RealAuthorDAO {
    @PersistenceContext
    private EntityManager entityManager;


    @SuppressWarnings("unchecked")
    public Collection<Author> getAllAuthors() {
        String hql = "FROM Author as author ORDER BY author.ID";
        return (List<Author>) entityManager.createQuery(hql).getResultList();
    }

    public Author getAuthorById(int id) {
        return entityManager.find(Author.class, id);
    }

    public Author removeAuthorById(int id) {
        entityManager.remove(getAuthorById(id));
        return null;
    }

    public Author updateAuthor(Author newAuthor) {
        Author originalAuthor = getAuthorById(newAuthor.getId());
        originalAuthor.setName(newAuthor.getName());
        originalAuthor.setBooks(newAuthor.getBooks()); //will it be a problem?
        entityManager.flush();
        return null;
    }

    public Author insertAuthor(Author author) {
        entityManager.merge(author);
        return null;
    }
}
