package ru.vbekarev.ping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.vbekarev.ping.model.PingDto;

@RestController
public class PingController {
    @GetMapping("/ping")
    public PingDto ping() {
        RestTemplate restTemplate = new RestTemplate();
        PingDto response = restTemplate.getForObject("http://pong:8080/pong", PingDto.class);
        return response;
    }
}
