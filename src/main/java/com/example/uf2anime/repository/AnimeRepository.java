package com.example.uf2anime.repository;

import com.example.uf2anime.domain.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnimeRepository extends JpaRepository<Anime, UUID> {

}