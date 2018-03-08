package SpringWebService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value="/SpringWebService/Message")
public class MorningMessageService {
    @RequestMapping(value="/",method= RequestMethod.GET)
    public HashMap<Integer,Message> getAllMessages()
    {
        return MessageApplication.message;
    }

}
