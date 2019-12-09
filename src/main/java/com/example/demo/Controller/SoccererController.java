package com.example.demo.Controller;

import com.example.demo.Model.Soccerer;
import com.example.demo.Repository.SoccererRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//to juz jest kontroler
public class SoccererController {
    @Autowired//szukam klas co bym mogl utworzyc instancje i przypisac, automatic bo stringboot
    private SoccererRepository soccererRepository;

    //http://localhost:8080/hello

    @GetMapping("/hello")
    public String hello() {
        return "Hello " + System.getProperty("user.name");
    }

    @GetMapping("/all")
    public Iterable<Soccerer> all() {
        return soccererRepository.findAll();
    }

}
