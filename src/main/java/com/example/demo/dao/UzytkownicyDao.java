package com.example.demo.dao;

import com.example.demo.entitites.UzytkownicyEntity;
import org.springframework.data.repository.query.Param;

import java.util.List;

//@Mapper
public interface UzytkownicyDao {

    UzytkownicyEntity findOne(long id);

    List<UzytkownicyEntity> batchAdd(@Param("list") List<UzytkownicyEntity> dataList);
}