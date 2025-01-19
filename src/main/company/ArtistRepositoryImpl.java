package main.company;

import java.util.ArrayList;

public class ArtistRepositoryImpl implements ArtistRepository {

    // 리포지토리 패턴
    final ArrayList<Artist> artistList = new ArrayList<>();

    public void addArtist(Artist artist) {
        artistList.add(artist);
    }

    public void removeArtist(Artist artist) {
        artistList.remove(artist);
    }

    public Artist findArtistByName(String name) {
        Artist result = null;
        for (Artist a : artistList) {
            if (name.equals(a.getName())) {
                result = a;
            }
        }
        return result;
    }
}
