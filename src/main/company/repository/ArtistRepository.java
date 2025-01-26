package main.company.repository;


import main.company.Artist;

import java.util.List;

public interface ArtistRepository {
    public void addArtist(Artist artist);

    public void removeArtist(Artist artist);

    public List<Artist> findAll();

    public Artist findArtistByName(String name);

}
