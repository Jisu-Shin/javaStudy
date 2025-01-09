package main.ch6;

public class Ex6_1 {
    public static void main(String[] args) {
        GirlGroup snsd = new GirlGroup();
        GirlGroup redVelvet = new GirlGroup();

        System.out.println(snsd.getName());
        System.out.println(redVelvet.getName());
        System.out.println("-------------");

        snsd.setName("소녀시대");
        System.out.println(snsd.getName());
        snsd.setMembers(9);
        System.out.println(snsd.getMembers());
        snsd.leaveGroup();
        System.out.println(snsd.getMembers());

        redVelvet.setName("레드벨벳");
        System.out.println(redVelvet.getName());
        redVelvet.setMembers(4);
        System.out.println(redVelvet.getMembers());
        redVelvet.joinGroup();
        System.out.println(redVelvet.getMembers());
    }
}

