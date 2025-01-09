package main.ch7;

import main.ch6.GirlGroup;
import main.ch6.Member;

import java.time.LocalDate;

public class Ex7_1 {
    public static void main(String[] args) {
        Artist boa = new Artist("보아");
        Artist snsd = new GirlGroup("소녀시대", LocalDate.of(2007,8,5));
        // TODO
        // snsd.joinGroup(new Member("윤아"));

        // 오버라이딩 실습
        System.out.println(boa.toString());
        System.out.println(snsd.toString());
    }
}
