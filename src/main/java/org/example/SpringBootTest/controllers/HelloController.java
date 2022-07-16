package org.example.SpringBootTest.controllers;


import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
public class HelloController {

    @GetMapping()
    public String greeting( Long id) {
//        model.addAttribute("name", "Alex");/        return "hello";
        return "hello";
    }

}