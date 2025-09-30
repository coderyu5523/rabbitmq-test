package com.example.rabbittest.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.*;
import org.springframework.context.annotation.*;

@Configuration
public class RabbitConfig {

    // @Bean
    // public Queue ymlQueue(org.springframework.core.env.Environment env) {
    //     String q = env.getProperty("app.rabbit.queue", "yml.queue");
    //     return new Queue(q, true);
    // }

    // @Bean
    // public MessageConverter jacksonMessageConverter() {
    //     return new Jackson2JsonMessageConverter();
    // }

    
}