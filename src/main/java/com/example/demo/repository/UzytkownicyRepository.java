package com.example.demo.repository;

import com.example.demo.entitites.UzytkownicyEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UzytkownicyRepository extends BaseRepository<UzytkownicyEntity> {

    @Query(value = "SELECT * FROM UZYTKOWNICY  WHERE ID_UZYTKOWNIKA=?1",nativeQuery = true)
    UzytkownicyEntity findOne(long id);
    @Query(value = "SELECT MAX(ID_UZYTKOWNIKA) from UZYTKOWNICY",nativeQuery=true)
    long max();
    void deleteByIdUzytkownika(long id);
    @Query(value="select TYTUL,pozycja,DEADLINE  from PUBLIKACJE  inner join EGZEMPLARZE using(ISBN) inner join WYPOZYCZENIA using (ISBN) where ID_UZYTKOWNIKA =?",nativeQuery = true)
    List<Object> getAllByIdUzytkownika(Long id);
}