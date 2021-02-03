package com.example.demo.repository;

import com.example.demo.entitites.WynajemEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WynajemRepository extends BaseRepository<WynajemEntity> {


    @Query(value="SELECT GODZ_ROZPOCZECIA,GODZ_ZAKONCZENIA from  WYNAJEM where ID_SALI=? and EXTRACT(day from DATA) =?",nativeQuery = true)
    List<Object> getAllMy(Long id_s,int day);
}