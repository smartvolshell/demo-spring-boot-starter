package com.volshell.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloService {

    @Value("${hello.message}")
    private String message;

    public String sayHello() {
        return ("hello " + message);
    }
}
