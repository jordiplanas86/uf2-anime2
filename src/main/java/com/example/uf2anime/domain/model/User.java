package com.example.uf2anime.domain.model;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name="usser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID userid;

    public String username;
    public String password;
    public String role;
    public boolean enabled;

    @ManyToMany(mappedBy = "favoritedBy")
    public Set<Anime> favorites;

    @ManyToMany(mappedBy = "vistoBy")
    public Set<Anime> visto;

}