package gov.newworldorder.Service;


import gov.newworldorder.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {
    @Autowired

    private gov.newworldorder.DAO.FakeBookDB FakeBookDB;

    public Collection<Book> getAllBooks(){
        return this.FakeBookDB.getAllBooks();
    }
    public Book getBookById(int id) {
        return this.FakeBookDB.getBookById(id);
    }

    public Book removeBookById(int id) {
        return this.FakeBookDB.removeBookById(id);
    }

    public Book updateBook(Book Book) {
       return this.FakeBookDB.updateBook(Book);
    }

    public Book insertBook(Book Book) {
        return this.FakeBookDB.insertBook(Book);
    }




}
