package my.javastudy.company.repository;

import my.javastudy.company.domain.Artist;
import java.util.ArrayList;
import java.util.List;

public class ArtistRepositoryImpl implements ArtistRepository {

    // 리포지토리 패턴
    final ArrayList<Artist> artistList = new ArrayList<>();

    @Override
    public void addArtist(Artist artist) {
        artistList.add(artist);
    }

    @Override
    public void removeArtist(Artist artist) {
        artistList.remove(artist);
    }

    @Override
    public List<Artist> findAll() {
        return artistList;
    }

    @Override
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
