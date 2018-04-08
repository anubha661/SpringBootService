package Backup;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//to show that it is a document for the collection
@Document(collection = "MorningQuotes")
public class Message {
    @Id
    private  String messageCode;
    private String todaysMessage;

    public Message()
    {}
    public Message(String messageCode, String todaysMessage) {
        this.messageCode = messageCode;
        this.todaysMessage = todaysMessage;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getTodaysMessage() {
        return todaysMessage;
    }

    public void setTodaysMessage(String todaysMessage) {
        this.todaysMessage = todaysMessage;
    }


}
