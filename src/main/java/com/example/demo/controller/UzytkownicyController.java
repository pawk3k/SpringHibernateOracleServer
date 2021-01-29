package com.example.demo.controller;

import com.example.demo.service.UzytkownicyService;
import com.example.demo.service.dto.UzytkownicyDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {


        try {
            if(uzytkownicyService.findOne(id).isEmpty()) throw new Exception();
            uzytkownicyService.delete(id);
        } catch (Exception ex) {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body("Nie istnieje uzytkownika o podanym id");
        }
        return ResponseEntity.ok().body("ok");
    }


    @GetMapping("/list")
    public List<UzytkownicyDTO> list() {
        return uzytkownicyService.findAll();
    }
    @GetMapping("/max")
    public int max(){
        return uzytkownicyService.max();
    }
    @GetMapping("/uzytkownik/{id}")
    public Optional<UzytkownicyDTO> findOne(@PathVariable("id") Long id) {
        return uzytkownicyService.findOne(id);
    }
    @GetMapping("/rentList/{id}")
    public List<Object> rentList(@PathVariable("id") Long id){
        return uzytkownicyService.getAllByIdU(id);
    }
}