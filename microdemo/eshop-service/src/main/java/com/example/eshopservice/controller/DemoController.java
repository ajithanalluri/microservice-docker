package com.example.eshopservice.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

@RestController
public class DemoController {
    static final Logger log = Logger.getLogger(DemoMessageController.class.getName());

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping(value = "/response")
    public ResponseEntity<?> get() {

        log.info("DemoController :: getresponse");
        return new ResponseEntity<String>("eshop-service response",HttpStatus.OK);
    }

    @GetMapping("/")
    public String getHost() throws UnknownHostException
    {
        log.info("DemoMessageController :: getHost");
        return InetAddress.getLocalHost().getHostName()+" "+InetAddress.getLocalHost().getHostAddress();

    }

    @GetMapping("instanceId")
    public String instanceInfo() {
        
        log.info("DemoMessageController :: getHost");
        return eurekaClient.getApplication(appName).getName();
    }

}
