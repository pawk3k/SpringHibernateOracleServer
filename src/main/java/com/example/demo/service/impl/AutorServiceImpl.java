package com.example.demo.service.impl;

import com.example.demo.repository.AutorRepository;
import com.example.demo.service.AutorService;
import com.example.demo.service.dto.AutorDTO;
import com.example.demo.service.mapper.AutorMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AutorServiceImpl implements AutorService {
    @Resource
    private AutorMapper mapper;
    @Resource
    private AutorRepository repository;

    @Override
    public void save(AutorDTO dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void save(List<AutorDTO> dtos) {
        repository.saveAll(mapper.toEntity(dtos));
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }

    @Override
    public Optional<AutorDTO> findOne(Long id) {
        return Optional.ofNullable(mapper.toDto(repository.findOne(id)));
    }

    @Override
    public List<AutorDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }

}