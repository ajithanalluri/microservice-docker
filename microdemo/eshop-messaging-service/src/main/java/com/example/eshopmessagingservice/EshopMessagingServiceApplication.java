package  com.example.eshopmessagingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.logging.Logger;

@SpringBootApplication
@EnableEurekaClient
public class EshopMessagingServiceApplication {
    
    static final java.util.logging.Logger log = Logger.getLogger(EshopMessagingServiceApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(EshopMessagingServiceApplication.class, args);
        log.info("EshopMessagingServiceApplication ...");

    }
}
