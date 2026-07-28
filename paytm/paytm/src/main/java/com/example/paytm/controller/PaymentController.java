package com.example.paytm.controller;

import com.example.paytm.entity.PaymentEntity;
import com.example.paytm.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/payment")
    public String payment(@RequestBody PaymentEntity payment) {
        System.out.println(payment.toString());
        return service.payment(payment);

    }
}