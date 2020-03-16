package com.thusitha.webservice03;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

@RestController
public class FrontwebserviceApplication {

    @Autowired
    private LoadBalancerClient loadBalancer;

    public void method() {
        ServiceInstance serviceInstance = loadBalancer.choose("name-of-the-microservice01");
        System.out.println(serviceInstance.getUri());
    }
}