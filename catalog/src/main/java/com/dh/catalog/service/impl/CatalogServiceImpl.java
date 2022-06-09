package com.dh.catalog.service.impl;

import com.dh.catalog.repository.CatalogRepository;
import com.dh.catalog.service.CatalogService;
import com.dh.catalog.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieFeign movie;

    @Autowired
    private CatalogRepository repository;

    @Override
    public List findCatalogByMovie(String genre) {
        var movie = repository.findByGenre(genre);
        return movie;
    }

}
