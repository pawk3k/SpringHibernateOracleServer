package com.example.demo.service;

import com.example.demo.service.dto.SaleDTO;

import java.util.List;
import java.util.Optional;

public interface SaleService {
    void save(SaleDTO dto);

    void save(List<SaleDTO> dtos);

    void delete(Long id);


    List<SaleDTO> findAll();

}