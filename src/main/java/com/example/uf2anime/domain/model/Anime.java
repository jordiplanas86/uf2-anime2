package com.example.uf2anime.domain.model;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "movie")
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID animeid;

    public String name;
    public String description;
    public String type;
    public int year;
    public String image;
}
