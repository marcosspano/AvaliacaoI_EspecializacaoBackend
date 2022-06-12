package com.dh.catalog.service.impl;

import com.dh.catalog.service.CatalogService;
import com.dh.catalog.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieFeign movie;

    @Override
    public String findMovie(String genre) {
        return movie.findMovie(genre);
    }

}
