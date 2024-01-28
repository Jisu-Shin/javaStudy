public class Message extends Ums {
    String messageContent;
    String attachedFile;

    Message() {
        //생성자
        super();
    }

    boolean attachFile(String photo){
        attachedFile = photo;
        return true;
    }

    UmsTime reserveSendTime(UmsTime umsTime){
        if (umsTime.isValidSendTime())  {
            super.sendTime = umsTime;
        } else {
            // TODO  유효한 시간이 아닐 경우는 ?
        }
        return super.sendTime;
    }

    boolean canSend(Message m){ // 발송가능여부
        return true;
    }

    void setMessageContent(String messageContent){
        this.messageContent = messageContent;
    }

}
