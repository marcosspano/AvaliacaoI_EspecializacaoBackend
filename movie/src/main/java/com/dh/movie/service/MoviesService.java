package com.dh.movie.service;

import com.dh.movie.dto.MoviesDTO;
import com.dh.movie.entity.Movies;

import java.util.List;

public interface MoviesService {
    void save(MoviesDTO dto);
    List<Movies> findByGenre(String genre);
}
