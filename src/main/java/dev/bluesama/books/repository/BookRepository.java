package dev.bluesama.books.repository;

import dev.bluesama.books.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
