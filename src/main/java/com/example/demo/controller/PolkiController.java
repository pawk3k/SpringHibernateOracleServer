package com.example.demo.controller;

import com.example.demo.service.PolkiService;
import com.example.demo.service.dto.PolkiDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RequestMapping("/api/Polki")
@RestController
public class PolkiController {
    @Resource
    private PolkiService polkiService;

    @PostMapping("/save")
    public void save(@RequestBody PolkiDTO polki) {
        polkiService.save(polki);
    }

    @PostMapping("/delete")
    public void deleteByDTO(@RequestBody PolkiDTO polki) {
        polkiService.delteByS(polki);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        polkiService.delete(id);
    }

    @GetMapping("/list")
    public List<PolkiDTO> list() {
        return polkiService.findAll();
    }

    @GetMapping("/list/{kodRegalu}")
    public void listByKod(@PathVariable("kodRegalu") String kodRegalu) {
        polkiService.findAllByKod(kodRegalu);
    }
}