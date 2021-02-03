package com.example.demo.controller;

import com.example.demo.service.SaleService;
import com.example.demo.service.dto.SaleDTO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@CrossOrigin
@RequestMapping("/api/Sale")
@RestController
public class SaleController {
    @Resource
    private SaleService saleService;

    @PostMapping("/save")
    public void save(@RequestBody SaleDTO sale) {
        saleService.save(sale);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        saleService.delete(id);
    }

    @GetMapping("/list")
    public List<SaleDTO> list() {
        return saleService.findAll();
    }


}