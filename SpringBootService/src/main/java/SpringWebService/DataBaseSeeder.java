package SpringWebService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Component
public class DataBaseSeeder  implements CommandLineRunner {

    @Autowired
    private MessageRepository messageRepository;



    @Override
    public void run(String... strings)throws Exception
    {
        Message m1=new Message("goodMorning","1");
        Message m2=new Message("Coffee is the solution","2");
        Message m3=new Message("Work on your dreams","3");
        List<Message> message= Arrays.asList(m1,m2,m3);

        this.messageRepository.saveAll(message);


    }

}
