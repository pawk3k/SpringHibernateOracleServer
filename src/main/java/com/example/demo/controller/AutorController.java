package com.example.demo.controller;

import com.example.demo.service.AutorService;
import com.example.demo.service.dto.AutorDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RequestMapping("/api/Autor")
@RestController
public class AutorController {
    @Resource
    private AutorService autorService;

    @PostMapping("/save")
    public void save(@RequestBody AutorDTO autor) {
        autorService.save(autor);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        autorService.delete(id);
    }

    @GetMapping("/list")
    public List<AutorDTO> list() {
        return autorService.findAll();
    }


    @GetMapping("/autor/{id}")
    public Optional<AutorDTO> findOne(@PathVariable("id") Long id){ return autorService.findOne(id); }

    @GetMapping("kek")
    public String kek(){return  "kek";}
}