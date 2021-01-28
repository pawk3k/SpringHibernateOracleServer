package com.example.demo.service;

import com.example.demo.service.dto.EgzemplarzeDTO;

import java.util.List;

public interface EgzemplarzeService {
    void save(EgzemplarzeDTO dto);

    void save(List<EgzemplarzeDTO> dtos);

    void delete(Long id);

//    Optional<EgzemplarzeDTO> findOne(Long id);

    List<EgzemplarzeDTO> findAll();

}