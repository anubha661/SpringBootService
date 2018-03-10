package SpringWebService;

import java.util.Objects;

public class Message {

    private String  Todaymesage;
    private String MessageNumber;

    public Message(String todaymesage, String messagenumber) {
        Todaymesage = todaymesage;
        MessageNumber=messagenumber;
    }

    public String getMessageNumber() {
        return MessageNumber;
    }



    public void setMessageNumber(String messageNumber) {
        MessageNumber = messageNumber;
    }

    public String getTodaymesage() {
        return Todaymesage;
    }

    public void setTodaymesage(String todaymesage) {
        Todaymesage = todaymesage;
    }
}
