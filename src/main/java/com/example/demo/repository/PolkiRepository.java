package com.example.demo.repository;

import com.example.demo.entitites.PolkiEntity;
import com.example.demo.entitites.RegalyEntity;
import com.example.demo.repository.BaseRepository;

import java.util.List;

public interface PolkiRepository extends BaseRepository<PolkiEntity> {
    List<PolkiEntity> findAllByRegalyByKodRegalu(RegalyEntity regalyByKodRegalu);
}