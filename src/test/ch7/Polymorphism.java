package ch7;

import main.broadcast.Awards;
import main.company.Actor;
import main.company.Artist;
import main.company.GirlGroup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Polymorphism {
    /* 다형성 :: Chapter7-5 */

    Artist snsd;
    GirlGroup redvelvet;

    @BeforeEach
    void 그룹생성() {
        snsd = new GirlGroup("소녀시대");
        snsd.appearVarietyShow("유퀴즈");

        redvelvet = new GirlGroup("레드벨벳");
        redvelvet.appearVarietyShow("유퀴즈");
    }

    @Test
    void 참조변수() {
        // 조상타입의 참조변수로 참조
        System.out.println(snsd);

        // 인스턴스를 같은 타입의 참조변수로 참조
        // 사용할 수 있는 멤버의 개수가 더 크다
        System.out.println(redvelvet);
        redvelvet.sing();
        redvelvet.release();
    }

    @Test
    void 형변환() {
        Artist artist = null;
        GirlGroup girlGroup = new GirlGroup();
        Actor actor = new Actor("배우이름");

        // 조상타입 <- 자손타입 : 형변환 생략가능
        artist = girlGroup;
        artist = actor;

        // 자손타입 <- 조상타입 : 형변환 필수 (멤버개수가 다르기 때문에 ... 리모컨...)
//        girlGroup = artist;
//        girlGroup = (GirlGroup) artist;

    }

    @Test
    void 참조변수와인스턴스연결() {
        Artist a = new GirlGroup();
        GirlGroup g = new GirlGroup();

        System.out.println("a = " + a);
        System.out.println("g = " + g);
    }

    @Test
    void 매개변수의다형성() {
        Awards awards = new Awards();
        awards.appear(snsd);
        awards.appear(redvelvet);

        awards.count();

    }
}
