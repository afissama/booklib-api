package dev.bluesama.books.repository;

import dev.bluesama.books.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByCategories(String category);
}
