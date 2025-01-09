package main.ch6;

import main.ch7.Artist;

import java.time.LocalDate;
import java.util.ArrayList;

public class GirlGroup extends Artist {
    // TODO static 변수 , 메서드
    static int cv = 10;
    static void staticMethod() {
        System.out.println("staticMethod 사용중입니다");
    };

    // 인스턴스 변수
    // 포함
    ArrayList<Member> memberList = new ArrayList<>();

    // 코드의 중복을 제거하기 위해 생성자들끼리 서로 호출하도록 구현
    public GirlGroup() {
        super();
    }

    public GirlGroup(String name) {
        this(name, LocalDate.now());
    }

    public GirlGroup(LocalDate debutDt) {
        this("none", LocalDate.now());
    }

    public GirlGroup(String name, LocalDate debutDt) {
        super(name, debutDt, "GirlGroup");
    }

    public void joinGroup(Member m){
        staticMethod();
        memberList.add(m);
    }

    public void leaveGroup(Member m) {
        memberList.remove(m);
    }

    @Override
    public String toString() {
        return "GirlGroup{" +
                "name='" + name + '\'' +
                ", debutDt=" + debutDt +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getDebutDt() {
        return debutDt;
    }
}
