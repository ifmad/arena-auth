package co.madran.arena;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
