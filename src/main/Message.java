package main;

public class Message extends Ums {
    String messageContent;
    String attachedFile;

    Message() {
        //생성자
        super();
    }

    public boolean attachFile(String photo){
        attachedFile = photo;
        return true;
    }

    public void reserveSendTime(UmsDt umsDt){
        // TODO 임시방편용
    }

    boolean canSend(Message m){ // 발송가능여부
        return true;
    }

    void setMessageContent(String messageContent){
        this.messageContent = messageContent;
    }

}
