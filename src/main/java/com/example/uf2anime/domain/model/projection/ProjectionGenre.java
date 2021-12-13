package com.example.uf2anime.domain.model.projection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Set;
import java.util.UUID;

public interface ProjectionGenre{
    UUID getGEnreid();
    String getLabel();
    @JsonIgnoreProperties("genres")
    Set<ProjectionAnime> getAnimes();
}
