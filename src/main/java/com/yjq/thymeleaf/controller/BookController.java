package com.yjq.thymeleaf.controller;

import com.yjq.thymeleaf.bean.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {
    @GetMapping("/book")
    public String book(Model model){
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("三国演义" + i);
            book.setAuthor("罗贯中" +i);
            book.setPrice(30.0);
            books.add(book);
        }
        model.addAttribute("books",books);
        return "book";
    }
}
