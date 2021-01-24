package com.example.demo.repository;

import com.example.demo.entitites.UzytkownicyEntity;
import org.springframework.data.jpa.repository.Query;

public interface UzytkownicyRepository extends BaseRepository<UzytkownicyEntity> {

    @Query(value = "SELECT * FROM UZYTKOWNICY  WHERE ID_UZYTKOWNIKA=?1",nativeQuery = true)
    UzytkownicyEntity findOne(long id);
    @Query(value = "SELECT MAX(ID_UZYTKOWNIKA) from UZYTKOWNICY",nativeQuery=true)
    long max();
}