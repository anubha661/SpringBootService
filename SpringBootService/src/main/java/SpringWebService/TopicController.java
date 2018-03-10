package SpringWebService;

import SpringWebService.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;
    /*@RequestMapping("/messageaa")
    public List<Message> getAllMessages() //whatever we return is automatically going to get convereted to JSON becuase of the annotation
    {

        /*return Arrays.asList(

                new Message("Good Morning",1),
                new Message("have a nice day",2),
               new Message("Work Hard",3)

        );*/

        /* return topicService.getAllMessage();
    }*/
        /*@RequestMapping("/message/{foo}")
        public Message getMessage(@PathVariable(foo) String i)*/
        @RequestMapping("/message/{i}/{k}")
        public Message getMessage(@PathVariable String i,@PathVariable String k)
        {
            return topicService.getMessage(i,k);
        }

}
