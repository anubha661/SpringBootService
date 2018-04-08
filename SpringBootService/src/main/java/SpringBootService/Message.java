package SpringBootService;


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
        System.out.println("getmessagecode");
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        System.out.println("setmessagecode");
        this.messageCode = messageCode;
    }

    public String getTodaysMessage() {

        System.out.println("getmessage");return todaysMessage;
    }

    public void setTodaysMessage(String todaysMessage) {

        System.out.println("setmessagecode");
        this.todaysMessage = todaysMessage;
    }


}
