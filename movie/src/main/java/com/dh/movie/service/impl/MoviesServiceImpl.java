package com.dh.movie.service.impl;

import com.dh.movie.dto.MoviesDTO;
import com.dh.movie.entity.Movies;
import com.dh.movie.repository.MoviesRepository;
import com.dh.movie.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    private MoviesRepository repository;

    @Override
    public void save(MoviesDTO dto) {
        Movies movies = new Movies();
        movies.setName(dto.getName());
        movies.setGenre(dto.getGenre());
        movies.setUrlStream(dto.getUrlStream());
        repository.save(movies);
    }

    @Override
    public Movies findByGenre(String genre) {
        var movie = repository.findByGenre(genre);
        return movie;
    }

}
