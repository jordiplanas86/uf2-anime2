package com.example.uf2anime.controller;
import com.example.uf2anime.domain.model.Anime;
import com.example.uf2anime.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/animes")
public class AnimeController {
     @Autowired
    private AnimeRepository animeRepository;

    @GetMapping("/")
    public List<Anime> findAllMovies() {
        return animeRepository.findAll();
    }

    @PostMapping("/")
    public Anime createAnime(@RequestBody Anime anime) {
        return animeRepository.save(anime);
    }
}
