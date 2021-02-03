package com.example.demo.controller;

import com.example.demo.service.WynajemService;
import com.example.demo.service.dto.WynajemDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RequestMapping("/api/Wynajem")
@RestController
public class WynajemController {
    @Resource
    private WynajemService wynajemService;

    @PostMapping("/save")
    public void save(@RequestBody WynajemDTO wynajem) {
        wynajemService.save(wynajem);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        wynajemService.delete(id);
    }

    @GetMapping("/list")
    public List<WynajemDTO> list() {
        return wynajemService.findAll();
    }

    @GetMapping("/list/{id_s}/{day}")
    public List<Object> listMy(@PathVariable("id_s") Long id,@PathVariable("day") int day){
        return wynajemService.getAllMy(id,day);
    }
}