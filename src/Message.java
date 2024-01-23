public class Message extends Ums {
    String messageContent;
    String attachedFile;

    Message() {
        //생성자
    }

    boolean attachFile(String photo){
        attachedFile = photo;
        return true;
    }

    UmsTime reserveSendTime(UmsTime umsTime){

        return new UmsTime();
    }

    boolean canSend(Message m){ // 발송가능여부

        return true;

    }

}
