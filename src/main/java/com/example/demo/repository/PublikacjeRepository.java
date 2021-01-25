package com.example.demo.repository;

import com.example.demo.entitites.AutorEntity;
import com.example.demo.entitites.PublikacjeEntity;
import com.example.demo.repository.BaseRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PublikacjeRepository extends BaseRepository<PublikacjeEntity> {

    @Query(value = "SELECT * FROM PUBLIKACJE  WHERE ISBN=?1", nativeQuery = true)
    PublikacjeEntity findOne(long id);

    List<PublikacjeEntity> findByIsbnStartsWith(String isbn);

    List<PublikacjeEntity> findByTytulStartingWithOrGatunekStartingWithOrTematStartingWith(String tytul, String gatunek, String temat);


//    @Procedure(procedureName = "WypozyczEgzemplarz")
//    void rent(String isbn , String id_u, String id_e);

    //    @Query(value = "CALL WYPOZYCZEGZEMPLARZ('0000000000001',1,102)",nativeQuery = true)
//    @Query(value = "CALL WYPOZYCZEGZEMPLARZ(:isbn,:id_e,:id_u)",nativeQuery = true)
//    void rent(@Param("isbn") String isbn,@Param("id_e") String id_e,@Param("id_u") String id_u);
//    @Query(value = "CALL FIND_CARS_AFTER_YEAR(:year_in);", nativeQuery = true)
//    List<Car> findCarsAfterYear(@Param("year_in") Integer year_in);
    @Procedure(value = "WYPOZYCZEGZEMPLARZ")
    void rent(String isbn, String id_e, String id_u);

    @Procedure(value = "ODDAJEGZEMPLARZ")
    void unrent(String isbn, String id_e, String id_u);
//@Procedure(value = "")

//    @Query
//    void rent(String isbn , String id_u, String id_e);
}