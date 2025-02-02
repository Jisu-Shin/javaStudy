package my.javastudy.company.domain;

import java.time.LocalDate;

public class Actor extends Artist{
    public Actor(String name) {
        this(name,LocalDate.now());
    }

    public Actor(String name, LocalDate debutDt) {
        super(name, debutDt, ArtistType.ACTOR);
    }

    void act() {
        System.out.println(super.getName()+"가 연기를 한다");
    }

    void casting() {
        System.out.println(super.getName()+"가 캐스팅이 되었다");
    }
}
