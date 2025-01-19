package main.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


class GirlGroupTest {

    @Test
    void 걸그룹멤버추가하기() {
        Member yoona = new Member("윤아", LocalDate.of(1990,1,1));

        GirlGroup snsd = new GirlGroup("소녀시대");
        snsd.joinGroup(yoona);

        Assertions.assertEquals(snsd.getMemberCnt(),1);
    }

}