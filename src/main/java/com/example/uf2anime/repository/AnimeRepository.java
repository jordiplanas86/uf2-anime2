package com.example.uf2anime.repository;

import com.example.uf2anime.domain.model.Anime;
import com.example.uf2anime.domain.model.projection.ProjectionAnime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface AnimeRepository extends JpaRepository<Anime, UUID> {
    public List<ProjectionAnime> findBy();
}
