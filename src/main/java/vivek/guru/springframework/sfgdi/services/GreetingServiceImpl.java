package vivek.guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

//@Service Replaced by Constructor Greeting Service.
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }

}