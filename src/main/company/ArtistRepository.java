package main.company;


public interface ArtistRepository {
    public void addArtist(Artist artist);

    public void removeArtist(Artist artist);

    public Artist findArtistByName(String name);

}
