package com.example.demo.repository;

import com.example.demo.entitites.EgzemplarzeEntity;

import java.util.List;

public interface EgzemplarzeRepository extends BaseRepository<EgzemplarzeEntity> {
    @Override
    List<EgzemplarzeEntity> findAll();
}