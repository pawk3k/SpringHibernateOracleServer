package com.example.demo.repository;

import com.example.demo.entitites.AutorEntity;
import org.springframework.data.jpa.repository.Query;

public interface AutorRepository extends BaseRepository<AutorEntity> {
    @Query(value = "SELECT * FROM AUTOR a WHERE a.id=?1",nativeQuery = true)
    void delete(Long id);
    @Query(value = "SELECT * FROM AUTOR  WHERE ID_AUTORA=?1",nativeQuery = true)
    AutorEntity findOne(long id);
}