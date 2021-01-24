package com.example.demo.service;

import com.example.demo.service.dto.AutorDTO;

import java.util.List;
import java.util.Optional;

public interface AutorService {
    void save(AutorDTO dto);

    void save(List<AutorDTO> dtos);

    void delete(Long id);

    Optional<AutorDTO> findOne(Long id);

    List<AutorDTO> findAll();

}