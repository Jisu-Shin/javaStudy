public class UmsTime {
    private int hour;
    private int minute;
    private int second;

    final String START_TIME = "081000";
    final String END_TIME = "203000";

    UmsTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        if (isValidTime() == false){
            //todo 시간값 유효성 검증
        }
    }

    // 시간값유효성검증
    private boolean isValidTime() {
        if (hour < 0 || hour >23) {
            return false;
        }

        if (minute < 0 || minute >59) {
            return false;
        }

        if (second < 0 || second >59) {
            return false;
        }

        return true;
    }

    // 발송시간제한이 있음
    // 08:10:00 ~ 20:30:00 까지만 문자 발송 가능
    public boolean isValidSendTime() {

        String stringTime = String.format("%02d",hour) + String.format("%02d",minute) + String.format("%02d",second);

        if (stringTime.compareTo(START_TIME) >= 0 && stringTime.compareTo(END_TIME) <= 0 ) {
//            System.out.println(stringTime.compareTo(START_TIME));
//            System.out.println(stringTime.compareTo(END_TIME));
            return true;
        }

        return false;
    }
}
