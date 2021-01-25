package com.example.demo.service;

import com.example.demo.service.dto.PublikacjeDTO;

import java.util.List;
import java.util.Optional;

public interface PublikacjeService {
    void save(PublikacjeDTO dto);

    void save(List<PublikacjeDTO> dtos);

    void delete(Long id);
    void rent(String isbn , String id_u,String id_e);
    void unrent(String isbn , String id_u,String id_e);
    Optional<PublikacjeDTO> findOne(Long id);

    List<PublikacjeDTO> findAll();

    List<PublikacjeDTO> findAllLikeM(String isbn);
    List<PublikacjeDTO> findAllLike(String isbn);
}