package com.example.eshopmessagingservice.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class DemoMessageController {
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String getHost() throws UnknownHostException
    {
        return InetAddress.getLocalHost().getHostName()+" "+InetAddress.getLocalHost().getHostAddress();

    }

    @GetMapping("instanceId")
    public String instanceInfo() {
        return eurekaClient.getApplication(appName).getName();
    }

}
