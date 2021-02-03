package com.example.demo.service;

import com.example.demo.service.dto.WynajemDTO;

import java.util.List;
import java.util.Optional;

public interface WynajemService {
    void save(WynajemDTO dto);

    void save(List<WynajemDTO> dtos);

    void delete(Long id);

    List<Object> getAllMy(Long id,int day);
    List<WynajemDTO> findAll();

}