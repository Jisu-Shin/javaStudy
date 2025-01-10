package main.company;

/*Group만 멤버를 가진다*/
public class Member {
    String name;
    Gender gender;

    public Member(String name) {
        this.name = name;
    }

    public Member(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
}
