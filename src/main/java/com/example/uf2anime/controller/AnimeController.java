package com.example.uf2anime.controller;

import com.example.uf2anime.domain.model.Anime;
import com.example.uf2anime.domain.model.dto.ResponseList;
import com.example.uf2anime.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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

    @GetMapping("/{id}")
    public Object getAnime(@PathVariable UUID id){
       Anime anime = animeRepository.findById(id).orElse(null);

       if (anime == null){
           return ResponseEntity.status(HttpStatus.NOT_FOUND)
                   .body(com.example.demo.domain.dto.ErrorMessage.message("File not found"));
       }
       return ResponseEntity.ok().body(anime);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeAnime(@PathVariable UUID id) {
        Anime anime = animeRepository.findById(id).orElse(null);
        if (anime == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(com.example.demo.domain.dto.ErrorMessage.message("File not found"));
        }
        return ResponseEntity.ok().contentType(MediaType.valueOf(String.valueOf(anime.animeid)))
                .body(com.example.demo.domain.dto.ErrorMessage.message("File Deleted"));
    }
}