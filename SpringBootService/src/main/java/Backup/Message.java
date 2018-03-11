package Backup;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//to show that it is a document for the collection
@Document(collection = "MorningQuotes")
public class Message {
    public Message() {
    }

    private String  Todaymesage;
    @Id
    private String MessageNumber;

    public Message(String todaymesage, String messagenumber) {
        Todaymesage = todaymesage;
        MessageNumber=messagenumber;
    }

    public String getMessageNumber() {
        return MessageNumber;
    }


    public String getTodaymesage() {
        return Todaymesage;
    }


}
