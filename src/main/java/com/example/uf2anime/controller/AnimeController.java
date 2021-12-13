package com.example.uf2anime.controller;

import com.example.uf2anime.domain.model.Anime;
import com.example.uf2anime.domain.model.dto.ResponseList;
import com.example.uf2anime.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animes")
public class AnimeController {
     @Autowired
    private AnimeRepository animeRepository;

    @GetMapping("/")
    public ResponseEntity<?> findAllAnimes() {
        return ResponseEntity.ok().body(new ResponseList(animeRepository.findBy()));
    }

    @PostMapping("/")
    public Anime createAnime(@RequestBody Anime anime) {
        return animeRepository.save(anime);
    }

    @DeleteMapping
    public void removeAnime(@RequestBody Anime anime) { }
}