package com.example.demo.service.impl;

import com.example.demo.dao.PublikacjeDao;
import com.example.demo.repository.PublikacjeRepository;
import com.example.demo.service.PublikacjeService;
import com.example.demo.service.dto.PublikacjeDTO;
import com.example.demo.service.mapper.PublikacjeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PublikacjeServiceImpl implements PublikacjeService {
    @Resource
    private PublikacjeMapper mapper;
    @Resource
    private PublikacjeRepository repository;

    @Override
    public void save(PublikacjeDTO dto) {



        repository.save(mapper.toEntity(dto));
    }

    @Override
    public void save(List<PublikacjeDTO> dtos) {
        repository.saveAll(mapper.toEntity(dtos));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void rent(String isbn, String id_e, String id_u) {
        repository.rent(isbn, id_e, id_u);
    }

    @Override
    public void unrent(String isbn, String id_e, String id_u) {
        repository.unrent(isbn, id_e, id_u);
    }

    @Override
    public Optional<PublikacjeDTO> findOne(Long id) {
        return Optional.ofNullable(mapper.toDto(repository.findOne(id)));
    }

    @Override
    public List<PublikacjeDTO> findAll() {
        return mapper.toDto(repository.findAll());
    }

    @Override
    public List<PublikacjeDTO> findAllLike(String isbn) {
        return mapper.toDto(repository.findByIsbnStartsWith(isbn));
    }

    @Override
    public List<PublikacjeDTO> findAllLikeM(String isbn) {
        return mapper.toDto(repository.findByTytulStartingWithOrGatunekStartingWithOrTematStartingWith(isbn, isbn, isbn));
    }
}