package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UmsDt {
    private String umsDate;
    private String umsTime;

    final String SMS_START_TIME = "081000";
    final String SMS_END_TIME = "203000";

    public UmsDt(){
    }

    UmsDt(String dt) {
        if (isValidDt(dt)){
            // YYYYMMDD
            this.umsDate = dt.substring(0,8);
            // HHMMSS
            this.umsTime = dt.substring(8);
        }
        //TODO 값이 알맞지 않다면 Exception 필요
    }

    // 날짜, 시간값 유효성 검증
    public boolean isValidDt(String dt) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            sdf.parse(dt);
        } catch (ParseException e) {
//            throw new RuntimeException(e);
            return false;
        }

        return true;
    }
/*

    // 발송시간제한이 있음
    // 08:10:00 ~ 20:30:00 까지만 문자 발송 가능
    public boolean isValidSendTime() {
        String stringTime = String.format("%02d",hour) + String.format("%02d",minute) + String.format("%02d",second);
        if (stringTime.compareTo(SMS_START_TIME) >= 0 && stringTime.compareTo(SMS_END_TIME) <= 0 ) {
//            System.out.println(stringTime.compareTo(START_TIME));
//            System.out.println(stringTime.compareTo(END_TIME));
            return true;
        }

        return false;
    }
*/
}
