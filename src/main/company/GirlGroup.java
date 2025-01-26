package main.company;

import java.time.LocalDate;

public class GirlGroup extends Group{
    // TODO static 변수 , 메서드
    public static int cv = 10;
    public static void staticMethod() {
        System.out.println("staticMethod 사용중입니다");
    };

    // 인스턴스 변수
    ArtistType type;

    // 코드의 중복을 제거하기 위해 생성자들끼리 서로 호출하도록 구현
    public GirlGroup() {
        this("none");
    }

    public GirlGroup(String name) {
        this(name, LocalDate.now());
    }

    public GirlGroup(String name, LocalDate debutDt) {
        super(name, debutDt, ArtistType.GIRL_GROUP);
    }

    public void sing() {
        System.out.println(super.getName()+"이 노래를 한다");
    }

    public void release() {
        System.out.println(super.getName()+"이 앨범을 발매했다");
    }

    @Deprecated
    public void joinGroup(Member member) {
    }

    // TODO
    @Override
    void setType() {
        this.type = ArtistType.GIRL_GROUP;
    }

    @Override
    public String toString() {
        return "GirlGroup{" +
                "name='" + super.getName() + '\'' +
                ", debutDt=" + super.getDebutDt() +
                ", type='" + type + '\'' +
                '}';
    }

}
