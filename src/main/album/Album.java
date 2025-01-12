package main.album;

import main.company.Artist;

import java.util.ArrayList;
import java.util.List;

public class Album {
    Artist artist;
    String albumNm;
    int price;
    int salePrice;
    String albumCd;
    final List<Song> songList = new ArrayList<>();

    public Album(Artist artist, String albumNm, int price, int salePrice, String albumCd) {
        this.artist = artist;
        this.albumNm = albumNm;
        this.price = price;
        this.salePrice = salePrice;
        this.albumCd = albumCd;
    }

    public void addSong(Song song) {
        songList.add(song);
    }

    public Artist getArtist() {
        return artist;
    }

    public String getAlbumNm() {
        return albumNm;
    }

    public int getPrice() {
        return price;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public String getAlbumCd() {
        return albumCd;
    }
}
