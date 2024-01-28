public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Message m = new Message();
        System.out.println(m.canSend(m));
        System.out.println(m.send());

        UmsTime umsTime = new UmsTime(0,10,50);
        System.out.println("발송가능한 시간 여부 확인 0:10:50 ");
        System.out.println(umsTime.isValidSendTime());

        umsTime = new UmsTime(8,10,50);
        System.out.println("발송가능한 시간 여부 확인 8:10:50 ");
        System.out.println(umsTime.isValidSendTime());

        umsTime = new UmsTime(8,9,59);
        System.out.println("발송가능한 시간 여부 확인 8:9:59 ");
        System.out.println(umsTime.isValidSendTime());
    }
}