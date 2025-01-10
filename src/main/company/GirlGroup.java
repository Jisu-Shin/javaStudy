package main.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class GirlGroup extends Artist{
    // TODO static 변수 , 메서드
    public static int cv = 10;
    public static void staticMethod() {
        System.out.println("staticMethod 사용중입니다");
    };

    // 인스턴스 변수
    // 포함
    final ArrayList<Member> memberList;

    // 코드의 중복을 제거하기 위해 생성자들끼리 서로 호출하도록 구현
    public GirlGroup() {
        this("none");
    }

    public GirlGroup(String name) {
        this(name, LocalDate.now());
    }

    public GirlGroup(LocalDate debutDt) {
        this("none", LocalDate.now());
    }

    public GirlGroup(String name, LocalDate debutDt) {
        super(name, debutDt, "GirlGroup");
        memberList = new ArrayList<>();
    }

    public void sing() {
        System.out.println(name+"이 노래를 한다");
    }

    public void release() {
        System.out.println(name+"이 앨범을 발매했다");
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
                ", type='" + type + '\'' +
                '}';
    }

    public void setName(String name) {
        super.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDebutDt() {
        return debutDt;
    }
}
