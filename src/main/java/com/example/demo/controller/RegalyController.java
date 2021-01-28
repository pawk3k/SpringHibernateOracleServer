package com.example.demo.controller;

import com.example.demo.service.RegalyService;
import com.example.demo.service.dto.RegalyDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RequestMapping("/api/Regaly")
@RestController
public class RegalyController {
    @Resource
    private RegalyService regalyService;

    @PostMapping("/save")
    public void save(@RequestBody RegalyDTO regaly) {
        regalyService.save(regaly);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        regalyService.delete(id);
    }
    @GetMapping("/list")
    public List<RegalyDTO> list() {
        return regalyService.findAll();
    }


}