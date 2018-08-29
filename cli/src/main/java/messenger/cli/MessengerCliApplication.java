package messenger.cli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"messenger.context"})
@SpringBootApplication
public class MessengerCliApplication {

    public static void main(String[] args) {
        SpringApplication.run(MessengerCliApplication.class, args);
    }
}
