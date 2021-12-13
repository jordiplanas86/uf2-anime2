package com.example.uf2anime.domain.model;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID authorid;

    public String name;
    public String image;

    @ManyToMany(mappedBy = "author")
    public Set<Anime> anime;


}
