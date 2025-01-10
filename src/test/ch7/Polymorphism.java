package ch7;

import main.company.Actor;
import main.company.Artist;
import main.company.GirlGroup;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Polymorphism {
    /* 다형성 */

    @Test
    void 참조변수() {
        // 조상타입의 참조변수로 참조
        Artist snsd = new GirlGroup("소녀시대");
        snsd.appearVarietyShow("유퀴즈");
        System.out.println(snsd);

        // 인스턴스를 같은 타입의 참조변수로 참조
        // 사용할 수 있는 멤버의 개수가 더 크다
        GirlGroup redvelvet = new GirlGroup("레드벨벳");
        redvelvet.appearVarietyShow("유퀴즈");
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
        girlGroup = (GirlGroup) artist;

    }
}
