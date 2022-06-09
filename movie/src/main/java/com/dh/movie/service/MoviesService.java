package com.dh.movie.service;

import com.dh.movie.dto.MoviesDTO;
import com.dh.movie.entity.Movies;

public interface MoviesService {
    void save(MoviesDTO dto);
    Movies findByGenre(String genre);
}
