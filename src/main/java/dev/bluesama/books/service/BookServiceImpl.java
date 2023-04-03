package dev.bluesama.books.service;

import dev.bluesama.books.model.Book;
import dev.bluesama.books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return null;
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(String bookId) {
        Optional< Book > bookDb = bookRepository.findById(bookId);
        if (bookDb.isPresent()) {
            return bookDb.get();
        } else {
            return  null;
        }
    }

    @Override
    public void deleteBook(String id) {

    }
}
