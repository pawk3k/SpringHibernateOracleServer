package com.example.demo.service.impl;

import com.example.demo.dao.RegalyDao;
import com.example.demo.repository.RegalyRepository;
import com.example.demo.service.RegalyService;
import com.example.demo.service.dto.RegalyDTO;
import com.example.demo.service.mapper.RegalyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RegalyServiceImpl implements RegalyService {
    @Resource
    private RegalyMapper mapper;
    @Resource
    private RegalyRepository repository;

    @Override
    public void save(RegalyDTO dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void save(List<RegalyDTO> dtos) {
        repository.saveAll(mapper.toEntity(dtos));
    }

    @Override
    public void delete(String nrRegalu) {
        repository.deleteByKodRegalu(nrRegalu);
    }

    @Override
    public List<RegalyDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }

}