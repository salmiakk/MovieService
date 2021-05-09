package com.pjatk.movieservice.service;

import com.pjatk.movieservice.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.pjatk.movieservice.model.Category.*;

@Service
public class MovieService {

    public List<Movie> getMovies() {
        return List.of(
                new Movie(1L, "Wladca Pierscieni", PRZYGODOWY),
                new Movie(2L, "Osiem dni", OBYCZAJOWY),
                new Movie(3L, "Krok wstecz", KRYMINALNY)
        );
    }
    public Movie getMovieById(Long id) {
        return new Movie(id, "Kasztan z piekła", KRYMINALNY);
    }

    public Movie addMovie(Movie movie) {
        return movie;
    }

    public Movie editMovie(Long id, Movie movie) {
        return new Movie(id, movie.getName(), movie.getCategory());
    }

    public boolean deleteMovie(Long id) {
        return true;
    }

}
