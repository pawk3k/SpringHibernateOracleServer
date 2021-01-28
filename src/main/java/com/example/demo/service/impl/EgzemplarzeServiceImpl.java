package com.example.demo.service.impl;

import com.example.demo.repository.EgzemplarzeRepository;
import com.example.demo.service.EgzemplarzeService;
import com.example.demo.service.dto.EgzemplarzeDTO;
import com.example.demo.service.mapper.EgzemplarzeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EgzemplarzeServiceImpl implements EgzemplarzeService {
    @Resource
    private EgzemplarzeMapper mapper;
    @Resource
    private EgzemplarzeRepository repository;

    @Override
    public void save(EgzemplarzeDTO dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void save(List<EgzemplarzeDTO> dtos) {
        repository.saveAll(mapper.toEntity(dtos));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

//    @Override
//    public Optional<EgzemplarzeDTO> findOne(Long id) {
//        return Optional.ofNullable(mapper.toDto(repository.findById(id)));
//    }

    @Override
    public List<EgzemplarzeDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }
}