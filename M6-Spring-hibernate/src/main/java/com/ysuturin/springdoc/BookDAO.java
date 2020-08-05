package com.ysuturin.springdoc;

import java.util.List;

public interface BookDAO {

    List<Book> getAll();

    void insert(Book book);

    void update(int id, String title);

    void delete(Book book);

    Book findByTitle(String title);
}
