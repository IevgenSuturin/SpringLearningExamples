package com.ysuturin.springdoc.example21HIBER_part3;

import java.util.List;

public interface Dao<T> {

    List<T> getAll();

    void insert(T book);

    void update(int id, String title);

    void delete(T book);

    T findByTitle(String title);

}
