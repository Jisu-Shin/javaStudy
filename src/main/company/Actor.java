package main.company;

import java.time.LocalDate;

public class Actor extends Artist{
    public Actor(String name) {
        super(name);
    }

    public Actor(String name, LocalDate debutDt) {
        super(name, debutDt, ArtistType.ACTOR);
    }

    void act() {
        System.out.println(name+"가 연기를 한다");
    }

    void casting() {
        System.out.println(name+"가 캐스팅이 되었다");
    }
}
