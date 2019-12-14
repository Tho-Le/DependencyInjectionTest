package com.example.thole.dependenctinjectiontest;

import com.example.thole.dependenctinjectiontest.controllers.ConstructorInjectedController;
import com.example.thole.dependenctinjectiontest.controllers.MyController;
import com.example.thole.dependenctinjectiontest.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependenctinjectiontestApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependenctinjectiontestApplication.class, args);
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

    }

}
