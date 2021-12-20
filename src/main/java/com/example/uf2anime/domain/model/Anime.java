package com.example.uf2anime.domain.model;
import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "anime")
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID animeid;

    public String name;
    public String description;
    public String type;
    public int year;
    public String image;

    @ManyToMany
    @JoinTable(name="anime_author", joinColumns = @JoinColumn(name="animeid"), inverseJoinColumns = @JoinColumn(name="authorid"))
    public Set<Author> authors;

    @ManyToMany
    @JoinTable(name="anime_genre", joinColumns = @JoinColumn(name="animeid"), inverseJoinColumns = @JoinColumn(name="genreid"))
    public Set<Genre> genres;

    @ManyToMany
    @JoinTable(name="favorite", joinColumns = @JoinColumn(name="animeid"), inverseJoinColumns = @JoinColumn(name="userid"))
    public Set<User> favoriteBy;

    @ManyToMany
    @JoinTable(name="visto", joinColumns = @JoinColumn(name="animeid"), inverseJoinColumns = @JoinColumn(name="userid"))
    public Set<User> vistoBy;
}
