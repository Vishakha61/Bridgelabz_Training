package com.example.swiggy;

import com.example.swiggy.entity.OrderEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "paytm")
public interface MyFeign {

    @PostMapping("/payment")
    public String payment(@RequestBody OrderEntity order);

}