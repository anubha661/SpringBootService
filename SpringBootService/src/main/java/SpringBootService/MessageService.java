package SpringBootService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;
    
    public List<Message> getAll()
    {


        System.out.println("in message service");
        return this.messageRepository.findAll();
    }

}
