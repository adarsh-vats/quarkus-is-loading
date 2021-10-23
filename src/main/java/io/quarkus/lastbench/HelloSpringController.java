package io.quarkus.lastbench;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloInSpringRestWay")
public class HelloSpringController {

    @GetMapping(produces = "text/plain")
    public String sayHelloToSpringBootWay(){
        return "Greetings from the spring-boot rest web service..!";
    }
}
