package xyz.fengqing11.springboottest.controller;

import org.springframework.web.bind.annotation.*;
import xyz.fengqing11.springboottest.pojo.Book;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String  hello(String name) {
        return "hello" + name + "!";
    }

    @PostMapping("/book")
    public String addBook(@RequestBody Book book){
        return book.toString();
    }
}
