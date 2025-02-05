package my.javastudy.company.repository;

import my.javastudy.company.domain.Artist;

import java.util.List;

public interface ArtistRepository {
    public void addArtist(Artist artist);

    public void removeArtist(Artist artist);

    public List<Artist> findAll();

    public Artist findArtistByName(String name);

}
