package com.example.uf2anime.repository;


import com.example.uf2anime.domain.model.Genre;
import com.example.uf2anime.domain.model.projection.ProjectionAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GenreRepository extends JpaRepository<Genre, UUID> {
    public List<ProjectionAuthor> findBy();

}