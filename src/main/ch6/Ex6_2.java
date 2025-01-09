package main.ch6;

import java.time.LocalDate;

public class Ex6_2 {
    public static void main(String[] args) {
        System.out.println("객체생성 없이 사용이 가능한 cv" + GirlGroup.cv);

        GirlGroup snsd = new GirlGroup("소녀시대",LocalDate.of(2007,8,5));
        snsd.joinGroup(new Member("윤아"));
        snsd.joinGroup(new Member("태연"));
        snsd.joinGroup(new Member("티파니"));
        snsd.joinGroup(new Member("효연"));
        System.out.println(snsd.toString());

        GirlGroup redVelvet = new GirlGroup("레드벨벳", LocalDate.of(2014,8,1));
        redVelvet.joinGroup(new Member("아이린"));
        redVelvet.joinGroup(new Member("슬기"));
        System.out.println(redVelvet.toString());

        System.out.println(snsd.cv);            // -> GirlGroup.cv
        System.out.println(redVelvet.cv);       // -> GirlGroup.cv
        System.out.println("----------------");

//        snsd.cv = 100;
        GirlGroup.cv = 100; // (권장)

        // 공통변수인 클래스변수를 변경했기 때문에 redvelvet의 cv도 변경된다
        // 혼동이 생기지 않게 클래스변수는 GirlGroup.cv 로 작성해야한다
        System.out.println(snsd.cv);            // -> GirlGroup.cv
        System.out.println(redVelvet.cv);       // -> GirlGroup.cv

    }
}
