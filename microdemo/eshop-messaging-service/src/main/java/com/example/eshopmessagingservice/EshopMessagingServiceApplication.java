package  com.example.eshopmessagingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EshopMessagingServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EshopMessagingServiceApplication.class, args);
    }
}
