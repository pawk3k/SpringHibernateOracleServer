package com.example.demo.service;

import com.example.demo.service.dto.UzytkownicyDTO;

import java.util.List;
import java.util.Optional;

public interface UzytkownicyService {
    void save(UzytkownicyDTO dto);

    void save(List<UzytkownicyDTO> dtos);

    void delete(Long id);

    int max();

    Optional<UzytkownicyDTO> findOne(Long id);

    List<UzytkownicyDTO> findAll();

}