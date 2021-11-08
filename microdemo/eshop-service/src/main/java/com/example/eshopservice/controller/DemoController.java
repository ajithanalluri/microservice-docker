package com.example.eshopservice.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

  /*  @GetMapping(value = "/employee")
    public Employee firstPage() {
        log.info("DemoMessageController :: employee data");

        Employee emp = new Employee();
        emp.setName("emp1");
        emp.setDesignation("manager");
        emp.setEmpId("1");
        emp.setSalary(3000);

        return emp;
    }*/

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
