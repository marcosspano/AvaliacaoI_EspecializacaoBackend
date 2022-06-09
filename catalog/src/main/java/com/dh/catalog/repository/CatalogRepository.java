package com.dh.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends JpaRepository<Movie, Long> {

    @Query("select m from Movie m where m.genre = ?1")
    List findByGenre(String genre);

}
