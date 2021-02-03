package com.example.demo.repository;

import com.example.demo.entitites.RegalyEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RegalyRepository extends BaseRepository<RegalyEntity> {

    void deleteByKodRegalu(String kodRegalu);
}