package com.example.rabbittest.listner;

import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.example.rabbittest.service.MessageService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class MessageListener {
    private final MessageService messageService;

    @Value("${server.port:8080}")
    private int serverPort;

    @RabbitListener(queues = "${app.rabbit.queue:yml.queue}")
    public void onMessage(String body) {
        System.out.println("RabbitMQ 수신: " + body);

        String result = messageService.message();
        System.out.println("MessageService 결과: " + result);
    }
}