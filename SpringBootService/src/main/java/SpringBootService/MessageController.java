package SpringBootService;
//there cannot be two controllers with the same requestmapping in the same class path

//a controller is bascially java class that has certain annotations
//annotations tell what is the url mapping it to and what should happen when the request comes to that url
//has info about: what url access triggers it,what method to run when accessed
//Preset List of possible combination of JAR(s) that work well without issuses are called as Bill of Materials
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@RestController //this identifies that it is a rest controller
//methods can be added to this class that can be mapped with particular requests
public class MessageController {
    @Autowired
  private MessageService messageService;
    @Autowired
    private ReactiveMessageRepository reactiveMsgRepo;
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
        System.out.println("in controller");
     return this.messageService.getAll();
    }

    @RequestMapping(value = "/event",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Message> getAllStream()
    {
        /*return  reactiveMsgRepo.findAll()
                .flatMap(message ->
                {

                    Flux<MessageEvent> messageEventFlux=
                            Flux.fromStream(
                                    Stream.generate(()->new MessageEvent(message))
                            );
                    return messageEventFlux;
                });*/

       return reactiveMsgRepo.findAll().delaySequence(Duration.ofSeconds(2));
       // return reactiveMsgRepo.findAll();




    }

    @RequestMapping("/{id}")
    public Mono<Message> getMessage(@PathVariable("id") final String  id)
    {
        return reactiveMsgRepo.findById(id);
    }

}
