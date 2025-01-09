package main.ch6;


import java.time.LocalDate;

public class Ex6_3 {
    public static void main(String[] args) {
        GirlGroup snsd = new GirlGroup();
        snsd.setName("소녀시대");
        snsd.setMembers(9);
        snsd.leaveGroup();
        snsd.setDebutDt(LocalDate.of(2007,8,5));
        System.out.println(snsd.toString());

        GirlGroup redVelvet = new GirlGroup();
        redVelvet.setName("레드벨벳");
        redVelvet.setMembers(4);
        redVelvet.joinGroup();
        redVelvet.setDebutDt(LocalDate.of(2014,8,1));
        System.out.println(redVelvet.toString());

    }
}
