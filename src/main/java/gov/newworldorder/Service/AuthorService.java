package gov.newworldorder.Service;

import gov.newworldorder.DAO.RealAuthorDAO;
import gov.newworldorder.Entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AuthorService {

    private RealAuthorDAO authorDAO;

    @Autowired

    public AuthorService(RealAuthorDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    public Collection<Author> getAllAuthors() {
        return this.authorDAO.getAllAuthors();
    }

    public Author getBookById(int id) {
        return this.authorDAO.getAuthorById(id);
    }

    public Author removeAuthorById(int id) {
        return this.authorDAO.removeAuthorById(id);
    }

    public Author updateBook(Author author) {
        return this.authorDAO.updateAuthor(author);
    }

    public Author insertBook(Author author) {
        return this.authorDAO.insertAuthor(author);
    }
}
