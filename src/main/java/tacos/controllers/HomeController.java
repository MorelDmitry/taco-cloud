package tacos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "design";
    }

    @GetMapping("/homeTwo")
    public String homeTwo() {
        return "homeTwo";
    }
}
