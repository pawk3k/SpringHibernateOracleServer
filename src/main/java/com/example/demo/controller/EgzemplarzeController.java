package com.example.demo.controller;

import com.example.demo.service.EgzemplarzeService;
import com.example.demo.service.dto.EgzemplarzeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RequestMapping("/api/Egzemplarze")
@RestController
public class EgzemplarzeController {
    @Resource
    private EgzemplarzeService egzemplarzeService;

    @PostMapping("/save")
    public void save(@RequestBody EgzemplarzeDTO egzemplarze) {
        egzemplarzeService.save(egzemplarze);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {


        try {
            egzemplarzeService.delete(id);
        } catch (Exception ex) {
            return ResponseEntity
                    .status(HttpStatus.FORBIDDEN)
                    .body("Nie ma egzemplarzu o podanym id");
        }
        return ResponseEntity.ok().body("ok");
    }

    @GetMapping("/list")
    public List<EgzemplarzeDTO> list() {
        return egzemplarzeService.findAll();
    }
}