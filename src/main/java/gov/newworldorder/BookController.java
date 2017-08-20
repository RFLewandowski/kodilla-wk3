package gov.newworldorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/books")

public class BookController {

    @Autowired
    private FakeBookDB fakeBookDB;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Book> getAllBooks() {
        return this.fakeBookDB.getAllBooks();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    //TODO podpowiadanie parametrów adnotacji w Intelij nie jest zbut pomocne - w Eclipse chyba działało to lepiej
    public Book getBookById(@PathVariable("id") int id) {
        return this.fakeBookDB.getBookById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Book removeBookById(@PathVariable("id") int id) {
        return this.fakeBookDB.removeBookById(id);
    }

    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    public Book updateBook(@RequestBody Book book) {
        return fakeBookDB.updateBook(book);
    }

    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public Book insertBook(@RequestBody Book book) {
        return fakeBookDB.insertBook(book);
    }

}
