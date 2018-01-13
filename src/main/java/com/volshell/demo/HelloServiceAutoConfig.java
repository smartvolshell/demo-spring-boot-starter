package com.volshell.demo;

import com.volshell.demo.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloService.class)
@ConditionalOnProperty(prefix = "hello.service", value = "on",  matchIfMissing = true)
public class HelloServiceAutoConfig {

    @Bean("helloService")
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.sayHello();
        return helloService;
    }

}
