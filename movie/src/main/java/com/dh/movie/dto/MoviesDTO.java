package com.dh.movie.dto;

import lombok.Data;

@Data
public class MoviesDTO {
    private Long id;
    private String name;
    private String genre;
    private String urlStream;
}
