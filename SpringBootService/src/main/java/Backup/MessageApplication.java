package Backup;


//to tell spring that this is an spring application for that we will add annotation
//SpringBootApplication
//first argument for run() is the class that has main method and is annotated with
//@springBootApplication
//args = arguments that can be passed to main method, run is static method
//if i will simply hit localhost:8080 it will throw error coz there is no mapping for url
//this is servlet controller
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication

public class MessageApplication {

    public static void main(String args[])
    {

        SpringApplication.run(MessageApplication.class, args);
    }

}

//needs is to handle request, given this request i want to execute a piece of code on servlet container
//this can be accomplished by adding a controller to spring
//a controller is bascially java class that has certain annotations
//annotations tell what is the url mapping it to and what should happen when the request comes to that url
//has info about: what url access triggers it,what method to run when accessed
