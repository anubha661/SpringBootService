package SpringWebService;

//a controller is bascially java class that has certain annotations
//annotations tell what is the url mapping it to and what should happen when the request comes to that url
//has info about: what url access triggers it,what method to run when accessed

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //this identifies that it is a rest controller
//methods can be added to this class that can be mapped with particular requests
public class MessageController {

    //this method has to be accessed when the user hits http//localhost:8080/message
    //request mapping has to be done for this method
    //we want this method to be executed whenever request contains url /message
    @RequestMapping("/message")
    public String sayHie()
    {
        return "hi";
    }
}
