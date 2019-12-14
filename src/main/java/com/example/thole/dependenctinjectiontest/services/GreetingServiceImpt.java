package com.example.thole.dependenctinjectiontest.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpt implements GreetingService {

    private final String HELLO = "HELLO";
    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
