package com.example.demo.dao;

import java.util.List;

public interface MainDao<T> {
    boolean insert(T model);

    boolean update(T model);


    T findOne (long id);
    boolean delete(T model);

    List<T> selectAll();

    T select(String name);

}
