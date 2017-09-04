package gov.newworldorder.Controller;

import gov.newworldorder.Entity.Author;
import gov.newworldorder.Entity.Book;
import gov.newworldorder.Service.AuthorService;
import gov.newworldorder.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/books")

public class BookController {

    private final BookService bookService;
    private final AuthorService authorService;

    @Autowired
    public BookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping()
    public Collection<Book> getAllBooks() {
        return this.bookService.getAllBooks();
    }

    @GetMapping(value = "/{id}")
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


    @GetMapping(value = "/authors")
    public Collection<Author> getAllAuthors() {
        return this.authorService.getAllAuthors();
    }



}
