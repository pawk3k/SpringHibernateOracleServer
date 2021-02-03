package com.example.demo.service;

import com.example.demo.service.dto.RegalyDTO;

import java.util.List;
import java.util.Optional;

public interface RegalyService {
    void save(RegalyDTO dto);

    void save(List<RegalyDTO> dtos);

    void delete(String nrRegalu);

    List<RegalyDTO> findAll();

}