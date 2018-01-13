package com.volshell.demo;

import com.volshell.demo.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@SpringBootApplication
public class DemoSpringBootStarterApplication {
	@Resource
	private HelloService helloService;

	@RequestMapping("/admin")
	public String index(){
		return helloService.sayHello();
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootStarterApplication.class, args);
	}

}
