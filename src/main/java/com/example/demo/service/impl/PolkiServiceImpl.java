package com.example.demo.service.impl;

import com.example.demo.dao.PolkiDao;
import com.example.demo.repository.PolkiRepository;
import com.example.demo.service.PolkiService;
import com.example.demo.service.dto.PolkiDTO;
import com.example.demo.service.dto.RegalyDTO;
import com.example.demo.service.mapper.PolkiMapper;
import com.example.demo.service.mapper.RegalyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PolkiServiceImpl implements PolkiService {
    @Resource
    private PolkiMapper mapper;
    @Resource
    private RegalyMapper regalyMapper;
    @Resource
    private PolkiRepository repository;


//    @Override
//    public List<PolkiDTO> findByKod(RegalyDTO dto){
//        return mapper.toDto(repository.findAllByRegalyByKodRegalu(regalyMapper.toEntity(dto)));
//    }

    @Override
    public void save(PolkiDTO dto) {
        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void save(List<PolkiDTO> dtos) {
        repository.saveAll(mapper.toEntity(dtos));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

//    @Override
//    public Optional<PolkiDTO> findOne(Long id) {
//        return Optional.ofNullable(mapper.toDto(repository.findOne(id)));
//    }

    @Override
    public List<PolkiDTO> findAllByKod(String kod) {
        return mapper.toDto(repository.findAllByKodRegalu(kod));
    }
    @Override
    public List<PolkiDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }



}