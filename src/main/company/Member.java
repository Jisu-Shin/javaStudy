package main.company;

import java.time.LocalDate;

/*Group만 멤버를 가진다*/
public class Member {
    String name;
    LocalDate birth;

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

    public void setName(String name) {
        this.name = name;
    }
}
