package com.ysuturin.springdoc.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileMovieFinder implements MovieFinder {

    @Override
    public List<Movie> findAll() {
        List<Movie> result = new ArrayList<Movie>();
        result.addAll(Arrays.asList(
                new Movie("name1", "director"),
                new Movie("name2", "director1"),
                new Movie("name3", "director")));

        return result;
    }
}
