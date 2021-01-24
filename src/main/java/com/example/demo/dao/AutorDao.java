package com.example.demo.dao;

import com.example.demo.entitites.AutorEntity;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;
import org.springframework.data.repository.query.Param;

import java.util.List;

//@NoArgsConstructor
//@Mapper
public interface AutorDao {
    AutorEntity findOne(long id);
    List<AutorEntity> batchAdd(@Param("list") List<AutorEntity> dataList);
}