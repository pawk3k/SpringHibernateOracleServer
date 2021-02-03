package com.example.demo.service;

import com.example.demo.service.dto.PolkiDTO;
import com.example.demo.service.dto.RegalyDTO;

import java.util.List;
import java.util.Optional;

public interface PolkiService {
    void save(PolkiDTO dto);

    void save(List<PolkiDTO> dtos);

    void delete(Long id);

    void delteByS(PolkiDTO dto) ;
//    void delteByS(String kodRegalu,String nrPolki);
//    Optional<PolkiDTO> findOne(Long id);

//    List<PolkiDTO> findByKod(RegalyDTO regalyDTO);
    List<PolkiDTO> findAll();
    List<PolkiDTO> findAllByKod(String kod);



}