package net.home.simplecrud.repository;

import net.home.simplecrud.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books,Integer> {

}
