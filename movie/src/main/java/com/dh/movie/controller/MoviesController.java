package com.dh.movie.controller;

import com.dh.movie.dto.MoviesDTO;
import com.dh.movie.entity.Movies;
import com.dh.movie.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesService service;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody MoviesDTO dto) {
        service.save(dto);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/{genre}")
    public List<Movies> findByGenre(@PathVariable String genre) {
        return service.findByGenre(genre);
    }

}
