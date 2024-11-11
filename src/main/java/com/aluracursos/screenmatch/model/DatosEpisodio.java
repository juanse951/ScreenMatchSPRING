package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosEpisodio(

        @JsonAlias("Title") String titulo,

        @JsonAlias("Episode") String numeroEpisodio,

        @JsonAlias("imdbRating") String evaluaciones,

        @JsonAlias("Released") String fechaDeLanzamiento
) {
}
