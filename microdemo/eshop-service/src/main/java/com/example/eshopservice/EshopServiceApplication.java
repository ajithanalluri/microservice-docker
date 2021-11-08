package  com.example.eshopservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.logging.Logger;

@SpringBootApplication
@EnableEurekaClient
public class EshopServiceApplication {
     static final java.util.logging.Logger log = Logger.getLogger(EshopServiceApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(EshopServiceApplication.class, args);
                log.info("EshopServiceApplication...");

    }
}
