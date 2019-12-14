package com.example.thole.dependenctinjectiontest.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingServices implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
