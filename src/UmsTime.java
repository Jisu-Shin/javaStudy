public class UmsTime {
    private int hour;
    private int minute;
    private int second;

    UmsTime(int year, int month, int day, int hour, int minute, int second) {
        if (isValidTime()){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    // 시간값유효성검증
    private boolean isValidTime() {
        return true;
    }

    // 발송시간제한이 있음
    // 08:10:00 ~ 20:30:00 까지만 문자 발송 가능
    public boolean isValidSendTime() {
        return true;
    }
}
