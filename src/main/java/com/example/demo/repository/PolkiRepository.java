package com.example.demo.repository;

import com.example.demo.entitites.PolkiEntity;
import com.example.demo.entitites.RegalyEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PolkiRepository extends BaseRepository<PolkiEntity> {
//    List<PolkiEntity> findAllByRegalyByKodRegalu(RegalyEntity regalyByKodRegalu);
    @Query(value = "SELECT NR_POLKI from  POLKI where KOD_REGALU=?1",nativeQuery = true)
    List<PolkiEntity> findAllByKodRegalu(String kodRegalu);
}