package SpringWebService;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Message> message= Arrays.asList(
           //there will be only one copy of this initialization
            //if we left it in Controller every time request comes new initialization will take place
            new Message("Good Morning",1),
            new Message("have a nice day",2),
            new Message("Work Hard",3)

    );
    public List<Message> getAllMessage()
    {
        return message;
    }
}
