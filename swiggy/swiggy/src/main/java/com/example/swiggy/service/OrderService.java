package com.example.swiggy.service;

import com.example.swiggy.MyFeign;
import com.example.swiggy.entity.OrderEntity;
import com.example.swiggy.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service

public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    MyFeign feign;

    public String placeOrder(OrderEntity order) {


        repository.save(order);
        OrderEntity z=new OrderEntity();
        z.setAmount(order.getAmount());
        z.setFood(order.getFood());
        z.setName(order.getName());
       // order.setId(0);
//        web client
//       Mono<String>x =  web.post().uri("/payment").bodyValue(order).retrieve().bodyToMono(String.class);


//        feign client
        String x= feign.payment(z);
        if (x.startsWith("Payment")) {
            order.setOrderSuccess(true);
            repository.save(order);
            return "Order Placed Successfully";
        }

        return "Order Not Placed";
    }

}