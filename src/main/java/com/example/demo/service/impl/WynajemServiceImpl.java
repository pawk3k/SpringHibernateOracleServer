package com.example.demo.service.impl;

import com.example.demo.dao.WynajemDao;
import com.example.demo.repository.WynajemRepository;
import com.example.demo.service.WynajemService;
import com.example.demo.service.dto.WynajemDTO;
import com.example.demo.service.mapper.WynajemMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class WynajemServiceImpl implements WynajemService {
    @Resource
    private WynajemMapper mapper;
    @Resource
    private WynajemRepository repository;


    @Override
    public void save(WynajemDTO dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void save(List<WynajemDTO> dtos) {
        repository.saveAll(mapper.toEntity(dtos));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Object> getAllMy(Long id_s,int day) {
        return (repository.getAllMy(id_s,day));
    }


    @Override
    public List<WynajemDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }
}