package com.example.paytm.service;

import com.example.paytm.entity.PaymentEntity;
import com.example.paytm.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public String payment(PaymentEntity payment) {

        //payment.setSuccess(true);


        Random x = new Random();
        int n = x.nextInt(100,100000000);
        repository.save(payment);
        payment.setTransactionId(String.valueOf(n));


        payment.setSuccess(true);

        repository.save(payment);
        return "Payment success";
    }
}