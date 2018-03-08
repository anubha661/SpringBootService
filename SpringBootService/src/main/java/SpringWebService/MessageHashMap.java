package SpringWebService;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import static SpringWebService.MessageHashMap.messageData;


@SpringBootApplication
public class MessageHashMap {
    public static HashMap<Integer,Message> messageData;
    public static void main(String args[]){
        messageData=new HashMap<Integer,Message>();

        Message one=new Message("Hello Good Morning",1);
        messageData.put(one.getMessageNumber(),one);

        Message two=new Message("Hello,Have a nice day",2);
        messageData.put(one.getMessageNumber(),two);




    }


}

