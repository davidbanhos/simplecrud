package net.home.simplecrud.controller;

import net.home.simplecrud.model.Books;
import net.home.simplecrud.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    BooksService booksService;

    @GetMapping("/app/books")
    public String books(Model library) {
        List<Books> list = booksService.getAllBooks();
        library.addAttribute("library", list);
        return "Library";
    }

    @GetMapping("/app/book/edit")
    public String editBook(Model library) {
        return "EditBook";
    }

    @GetMapping("/app/book/register")
    public String registerBook(@RequestParam(value = "id", required = false) Integer id, Model library) {

        if (id != null) {
            library.addAttribute("book", booksService.getBooksById(id));
        }

        return "RegisterBook";
    }

    @PostMapping("/app/book/save")
    public String saveBook(@ModelAttribute Books book){
        booksService.saveOrUpdate(book);
        return "redirect:/";
    }

    @GetMapping("/app/book/remove")
    public String remove(@RequestParam Integer id) {
        booksService.delete(id);
        return "redirect:/";
    }

}
