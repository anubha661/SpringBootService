package Backup;
//there cannot be two controllers with the same requestmapping in the same class path

//a controller is bascially java class that has certain annotations
//annotations tell what is the url mapping it to and what should happen when the request comes to that url
//has info about: what url access triggers it,what method to run when accessed
//Preset List of possible combination of JAR(s) that work well without issuses are called as Bill of Materials
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //this identifies that it is a rest controller
//methods can be added to this class that can be mapped with particular requests
public class MessageController {
    @Autowired
  private MessageService messageService;
    //this method has to be accessed when the user hits http//localhost:8080/message
    //request mapping has to be done for this method
    //we want this method to be executed whenever request contains url /message



    @RequestMapping("/message")
    public String sayHie()
    {
        return "hi";
    }

    @RequestMapping("/allmessages")
     public List<Message> getAll()
    {
     return this.messageService.getAll();
    }


}
