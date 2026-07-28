package com.example.swiggy;

import feign.Feign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

@LoadBalancerClient(value="paytm")
public class LoadBalancer {
    @LoadBalanced
    @Bean
    public Feign.Builder xyz(){
        return new Feign.Builder();
    }

}
