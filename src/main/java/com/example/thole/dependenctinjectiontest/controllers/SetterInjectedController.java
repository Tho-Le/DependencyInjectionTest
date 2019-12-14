package com.example.thole.dependenctinjectiontest.controllers;

import com.example.thole.dependenctinjectiontest.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
    @Autowired
    @Qualifier("getterGreetingServices")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
