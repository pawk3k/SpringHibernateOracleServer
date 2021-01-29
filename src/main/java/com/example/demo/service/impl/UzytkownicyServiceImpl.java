package com.example.demo.service.impl;

import com.example.demo.repository.UzytkownicyRepository;
import com.example.demo.service.UzytkownicyService;
import com.example.demo.service.dto.UzytkownicyDTO;
import com.example.demo.service.mapper.UzytkownicyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UzytkownicyServiceImpl implements UzytkownicyService {
    @Resource
    private UzytkownicyMapper mapper;
    @Resource
    private UzytkownicyRepository repository;

    @Override
    public void save(UzytkownicyDTO dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void save(List<UzytkownicyDTO> dtos) {
        repository.saveAll(mapper.toEntity(dtos));
    }

    @Override
    public void delete(Long id) {
        repository.deleteByIdUzytkownika(id);
    }

    @Override
    public int max() {
        return (int) repository.max();
    }

    @Override
    public Optional<UzytkownicyDTO> findOne(Long id) {
        return Optional.ofNullable(mapper.toDto(repository.findOne(id)));
    }
    public List<Object> getAllByIdU(Long id){
        return repository.getAllByIdUzytkownika(id);
    }
    @Override
    public List<UzytkownicyDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }

}