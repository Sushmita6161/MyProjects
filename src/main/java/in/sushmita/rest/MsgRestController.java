package in.sushmita.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController{

    public MsgRestController() {
        System.out.println("MsgRestController :: Constructor Called");
    }

    @GetMapping("/")
    public String generateMsg()
    {
        return  "Welcome to Spring Boot :)";
    }
}
