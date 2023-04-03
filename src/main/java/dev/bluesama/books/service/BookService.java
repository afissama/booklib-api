package dev.bluesama.books.service;

import dev.bluesama.books.model.Book;
import org.bson.types.ObjectId;

import java.util.List;

public interface BookService {
    Book createBook(Book book);

    Book updateBook(Book book);

    List< Book > getAllBook();
    Book getBookById(String bookId);

    List< Book > getAllBookByCat(String category);

    void deleteBook(String id);
}
