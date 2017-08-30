package gov.newworldorder.Controller;

import gov.newworldorder.DAO.RealBookDAO;
import gov.newworldorder.Entity.Book;
import gov.newworldorder.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/books")

public class BookController {

    @Autowired
    private BookService bookService;
//    @Autowired
//    private RealBookDAO realBookDAO;


    @GetMapping()
    public Collection<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

//    @GetMapping(value = "/db")
//        only connect with DB no output expected right now
//    public void testDB() {
//        realBookDAO.getCurrentSession();
//    }

    @GetMapping(value = "/{id}")
    //TODO podpowiadanie parametrów adnotacji w Intelij nie jest zbut pomocne - w Eclipse chyba działało to lepiej
    public Book getBookById(@PathVariable("id") int id) {
        return this.bookService.getBookById(id);
    }

    @DeleteMapping(value = "/{id}")
    public Book removeBookById(@PathVariable("id") int id) {
        return this.bookService.removeBookById(id);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Book insertBook(@RequestBody Book book) {
        return bookService.insertBook(book);
    }

}
