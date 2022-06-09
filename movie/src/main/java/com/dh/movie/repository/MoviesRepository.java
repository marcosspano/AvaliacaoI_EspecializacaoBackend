package com.dh.movie.repository;

import com.dh.movie.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends JpaRepository <Movies, Long> {
    Movies findByGenre(String genre);
}
