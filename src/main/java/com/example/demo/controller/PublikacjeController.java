package com.example.demo.controller;

import com.example.demo.service.PublikacjeService;
import com.example.demo.service.dto.PublikacjeDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RequestMapping("/api/Publikacje")
@RestController
public class PublikacjeController {
    @Resource
    private PublikacjeService publikacjeService;

    @PostMapping("/save")
    public void save(@RequestBody PublikacjeDTO publikacje) {
        publikacjeService.save(publikacje);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        publikacjeService.delete(id);
    }

    @GetMapping("/list")
    public List<PublikacjeDTO> list() {
        return publikacjeService.findAll();
    }

    @GetMapping("/list1/{id}")
    public List<PublikacjeDTO> listLikeMore(@PathVariable("id") String id) {
        return publikacjeService.findAllLike(id);
    }

    @GetMapping("/list/{id}")
    public List<PublikacjeDTO> listLike(@PathVariable("id") Long id) {
        return publikacjeService.findAllLike(id + "");
    }

    @GetMapping("/rent/{isbn}/{id_e}/{id_u}")
    public void rent(@PathVariable("isbn") String isbn, @PathVariable("id_e") String id_e, @PathVariable("id_u") String id_u) {
        publikacjeService.rent(isbn, id_e, id_u);
    }

    @GetMapping("/unrent/{isbn}/{id_e}/{id_u}")
    public void unrent(@PathVariable("isbn") String isbn, @PathVariable("id_e") String id_e, @PathVariable("id_u") String id_u) {
        publikacjeService.unrent(isbn, id_e, id_u);
    }

}