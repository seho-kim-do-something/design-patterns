package com.example.factorydesign;

import com.example.factorydesign.factory.PhoneFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FactoryDesignApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FactoryDesignApplication.class, args);
        PhoneFactory phoneFactory = (PhoneFactory) context.getBean(PhoneFactory.class);
        //PhoneFactory phoneFactory = (PhoneFactory) context.getBean("phoneFactory");

        phoneFactory.getPhone("android");
        phoneFactory.getPhone("i");
        phoneFactory.getPhone("windows");
    }

}
