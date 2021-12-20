package com.example.uf2anime.controller;

import com.example.uf2anime.domain.model.Author;
import com.example.uf2anime.domain.model.dto.ResponseList;
import com.example.uf2anime.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/")
    public ResponseEntity<?> findAllAuthors() {
        return ResponseEntity.ok().body(new ResponseList(authorRepository.findBy()));
    }

    @PostMapping("/")
    public Author createAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

}
