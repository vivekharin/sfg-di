package vivek.guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vivek.guru.springframework.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;
    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}