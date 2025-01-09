package main.ch6;

import java.time.LocalDate;

public class Member {
    String name;
    LocalDate birth;

    public Member(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }
}
