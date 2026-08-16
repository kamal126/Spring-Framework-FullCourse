package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String Hello(){
        return "<h1>Hello Welcome to Spring Boot!!!</h1>";
    }

    @GetMapping("bye")
    public String Bye(){
        return "<h1>Hello Bye Bye see you soon!!!</h1>";
    }
}
