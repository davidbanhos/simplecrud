package net.home.simplecrud.service;

import net.home.simplecrud.model.Books;
import net.home.simplecrud.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<Books>();
        booksRepository.findAll().forEach(element -> books.add(element));
        return books;
    }

    public Books getBooksById(int bookid) {
        return booksRepository.findById(bookid).get();
    }

    public void delete(int bookid) {
        booksRepository.deleteById(bookid);
    }

    public void saveOrUpdate(Books books) {
        booksRepository.saveAndFlush(books);
    }

}
