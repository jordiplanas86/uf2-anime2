package com.example.uf2anime.controller;

import com.example.uf2anime.domain.model.Genre;
import com.example.uf2anime.domain.model.dto.ResponseList;
import com.example.uf2anime.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/genre")
public class GenreController {
    @Autowired
    private GenreRepository genreRepository;

    @GetMapping("/")
    public ResponseEntity<?> findAllAuthors() {
        return ResponseEntity.ok().body(new ResponseList(genreRepository.findBy()));
    }

    @PostMapping("/")
    public Genre createAuthor(@RequestBody Genre genre) {
        return genreRepository.save(genre);
    }

}
