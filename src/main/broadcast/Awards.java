package main.broadcast;

import main.company.Artist;

import java.util.ArrayList;

public class Awards {
    final ArrayList<Artist> artistList = new ArrayList<>();

    public void appear(Artist artist) {
        artistList.add(artist);
    }

    public void count() {
        System.out.println("출연진의 수는 "+artistList.size()+"팀 입니다.");
    }
}
