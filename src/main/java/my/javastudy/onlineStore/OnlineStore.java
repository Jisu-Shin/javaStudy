package my.javastudy.onlineStore;


import my.javastudy.album.Album;
import my.javastudy.company.domain.Artist;

import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    final List<Artist> artistList = new ArrayList<>();
    final List<Album> albumList = new ArrayList<>();

    public void addArtist(Artist artist) {
        artistList.add(artist);
    }

    public void addAlbum(Album album) {
        if (album.getArtist() instanceof Artist) {
            albumList.add(album);
        }
    }
}
