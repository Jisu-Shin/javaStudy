package main.onlineStore;

import main.album.Album;
import main.company.Artist;

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
