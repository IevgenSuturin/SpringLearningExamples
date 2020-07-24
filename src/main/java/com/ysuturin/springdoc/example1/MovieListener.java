package com.ysuturin.springdoc.example1;

import java.util.List;
import java.util.stream.Collectors;

public class MovieListener {
    MovieFinder finder;

    List<Movie> moviesDirectByString(final String director){

        return  finder.findAll()
                .stream()
                .filter(movie -> movie.getDirector() == director).collect(Collectors.toList());
    }

    public MovieFinder getFinder() {
        return finder;
    }

    public void setFinder(MovieFinder finder) {
        this.finder = finder;
    }
}
