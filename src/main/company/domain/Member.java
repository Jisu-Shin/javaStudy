package main.company.domain;

import java.time.LocalDate;

/*Group만 멤버를 가진다*/
public class Member {
    private String name;
    private LocalDate birth;

    public Member(String name){
        this(name, LocalDate.now());
    }

    public Member(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }
}
