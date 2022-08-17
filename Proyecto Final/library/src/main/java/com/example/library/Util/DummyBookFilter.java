package com.example.library.Util;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import com.example.library.model.Book;
import com.example.library.service.BookService;


@Component
public class DummyBookFilter {

    private final BookService bookService;
    public DummyBookFilter(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init() {
        
        bookService.addBook(new Book(null,"Juego de tronos", "un libro de la saga juego de tronos", "George R. R. Martin", 500,2));
        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null,"Choque de reyes", "un libro de la saga juego de tronos II", "George R. R. Martin", 600,3));
        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null,"Tormenta de espadas", "un libro de la saga juego de tronos III", "George R. R. Martin", 700,4));
        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null,"Festin de cuervos ", "un libro de la saga juego de tronos IV", "George R. R. Martin", 800,5));
        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null,"El retorno del rey", "un libro de la saga juego de tronos V", "George R. R. Martin", 900,6));
        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        }
}
