package burger.factory.api.project.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index() {
        return "Hello world";
    }

    @GetMapping("/hello")
    public String find() {
        return "{key: 'hello'}";
    }
}
