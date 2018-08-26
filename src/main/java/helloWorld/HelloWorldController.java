package helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index() {
        return "Hello world";
    }

    @RequestMapping("/nguyen")
    public  String nguyen() {
        return "Vo Dang Nguyen";
    }

}
