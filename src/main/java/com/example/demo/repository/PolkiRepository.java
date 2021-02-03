package com.example.demo.repository;

import com.example.demo.entitites.PolkiEntity;
import com.example.demo.entitites.RegalyEntity;
import com.example.demo.service.dto.PolkiDTO;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PolkiRepository extends BaseRepository<PolkiEntity> {
//    List<PolkiEntity> findAllByRegalyByKodRegalu(RegalyEntity regalyByKodRegalu);
    List<PolkiEntity> findAllByKodRegalu(String kodRegalu);

    @Query(value = "SELECT NR_POLKI,KOD_REGALU from  POLKI p where p.KOD_REGALU= ?1",nativeQuery = true)
    List<PolkiEntity> findAllByKodRegaluEquals(String kodRegalu);


//    Li
}