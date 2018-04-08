package Backup;


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
        Message m1=new Message("1","goodMorning");
        Message m2=new Message("2","Coffee is the solution");
        Message m3=new Message("3","Work on your dreams");
        List<Message> message= Arrays.asList(m1,m2,m3);

        this.messageRepository.saveAll(message);



    }

}
