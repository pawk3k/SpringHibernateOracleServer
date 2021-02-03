package com.example.demo.service.impl;

import com.example.demo.dao.SaleDao;
import com.example.demo.repository.SaleRepository;
import com.example.demo.service.SaleService;
import com.example.demo.service.dto.SaleDTO;
import com.example.demo.service.mapper.SaleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SaleServiceImpl implements SaleService {
    @Resource
    private SaleMapper mapper;
    @Resource
    private SaleRepository repository;


    @Override
    public void save(SaleDTO dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void save(List<SaleDTO> dtos) {
        repository.saveAll(mapper.toEntity(dtos));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<SaleDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }


}