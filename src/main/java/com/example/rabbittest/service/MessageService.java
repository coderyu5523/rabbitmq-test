package com.example.rabbittest.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String message() {
        return "서비스 호출됨";
    }
}
