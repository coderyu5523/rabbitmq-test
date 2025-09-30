package com.example.rabbittest.listner;

import org.slf4j.*;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class MessageListener {

    //private static final Logger log = LoggerFactory.getLogger(MessageListener.class);
    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${server.port:8080}")
    private int serverPort;

    @RabbitListener(queues = "${app.rabbit.queue:yml.queue}")
    public void onMessage(String body) {
        System.out.println("RabbitMQ 수신: " + body);

        String result = restTemplate.getForObject("http://localhost:" + serverPort + "/", String.class);
        System.out.println("GET / 결과: " + result);
    }
}