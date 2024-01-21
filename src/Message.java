public class Message {
    String sender;
    String[] receiver;
    String messageContent;
    String attachedFile;
    String sendState;
    MessageTime sendTime;
    MessageTime receiveTime;

    boolean attachFile(String photo){
        attachedFile = photo;
        return true;
    }

    MessageTime reserveSendTime(MessageTime mt){
        return new MessageTime();
    }

    String sendMessage(Message m) {

        return sendState;
    }

    boolean canSend(Message m){ // 발송가능여부

        return true;
    }

}
