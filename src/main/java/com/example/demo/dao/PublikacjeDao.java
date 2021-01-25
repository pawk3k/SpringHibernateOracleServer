package com.example.demo.dao;

import com.example.demo.entitites.PublikacjeEntity;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PublikacjeDao {

    void batchAdd(@Param("list") List<PublikacjeEntity> dataList);
}