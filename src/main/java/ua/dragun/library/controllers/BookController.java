package ua.dragun.library.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.dragun.library.dao.BookDao;
import ua.dragun.library.dao.BookSearchDao;
import ua.dragun.library.entity.Book;

@Controller
public class BookController {

    @Autowired
    BookDao bookDao;

    @Autowired
    BookSearchDao bookSearchDao;


    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("bookList", bookDao.findAll());
        return "index";
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public String addBook(@ModelAttribute Book book) {
        bookDao.save(book);
        return "redirect:index";
    }

    @RequestMapping(value = "/search")
    public String search(@RequestParam String search, Model model) {
        model.addAttribute("bookList", bookSearchDao.searchBooks(search));
        model.addAttribute("search", search);
        return "index";
    }
}
