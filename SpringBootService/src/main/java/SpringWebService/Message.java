package SpringWebService;

public class Message {

    private String  Todaymesage;
    private int MessageNumber;

    public Message(String todaymesage,int messagenumber) {
        Todaymesage = todaymesage;
        MessageNumber=messagenumber;
    }

    public int getMessageNumber() {
        return MessageNumber;
    }

    public void setMessageNumber(int messageNumber) {
        MessageNumber = messageNumber;
    }

    public String getTodaymesage() {
        return Todaymesage;
    }

    public void setTodaymesage(String todaymesage) {
        Todaymesage = todaymesage;
    }
}
