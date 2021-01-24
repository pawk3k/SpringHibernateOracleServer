package com.example.demo.controller;

import com.example.demo.service.UzytkownicyService;
import com.example.demo.service.dto.AutorDTO;
import com.example.demo.service.dto.UzytkownicyDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("/api/Uzytkownicy")
@RestController
public class UzytkownicyController {
    @Resource
    private UzytkownicyService uzytkownicyService;

    @PostMapping("/save")
    public void save(@RequestBody UzytkownicyDTO uzytkownicy) {

        uzytkownicyService.save(uzytkownicy);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        uzytkownicyService.delete(id);
    }

    @GetMapping("/list")
    public List<UzytkownicyDTO> list() {
        return uzytkownicyService.findAll();
    }

    @GetMapping("/uzytkownik/{id}")
    public Optional<UzytkownicyDTO> findOne(@PathVariable("id") Long id) {
        return uzytkownicyService.findOne(id);
    }

}