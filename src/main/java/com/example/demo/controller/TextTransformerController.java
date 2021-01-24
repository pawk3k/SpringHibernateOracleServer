package com.example.demo.controller;

import com.example.demo.entitites.AutorEntity;
import com.example.demo.repository.AutorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/")
public class TextTransformerController {

    private static final Logger logger = LoggerFactory.getLogger(TextTransformerController.class);

    AutorRepository autorRepository;
    public TextTransformerController(AutorRepository autorRepository){
        this.autorRepository = autorRepository;
    }
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String
    get(@RequestParam(value = "text", defaultValue = "test") String text,
                           @RequestParam(value = "transforms", defaultValue = "upper,escape") String[] transforms) {
        return "kek";
//        return autorRepository.getOne((long)101);
    }
}