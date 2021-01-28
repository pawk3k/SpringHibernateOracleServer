package com.example.demo.controller;

import com.example.demo.service.EgzemplarzeService;
import com.example.demo.service.dto.EgzemplarzeDTO;
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
    public void delete(@PathVariable("id") Long id) {
        egzemplarzeService.delete(id);
    }

    @GetMapping("/list")
    public List<EgzemplarzeDTO> list() {
        return egzemplarzeService.findAll();
    }
}