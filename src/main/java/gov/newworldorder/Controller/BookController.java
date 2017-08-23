package gov.newworldorder.Controller;

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

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    //TODO podpowiadanie parametrów adnotacji w Intelij nie jest zbut pomocne - w Eclipse chyba działało to lepiej
    public Book getBookById(@PathVariable("id") int id) {
        return this.bookService.getBookById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Book removeBookById(@PathVariable("id") int id) {
        return this.bookService.removeBookById(id);
    }

    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public Book insertBook(@RequestBody Book book) {
        return bookService.insertBook(book);
    }

}
