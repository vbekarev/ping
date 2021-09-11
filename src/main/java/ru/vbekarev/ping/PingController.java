package ru.vbekarev.ping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.vbekarev.ping.model.PingDto;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PingController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/ping")
    public PingDto ping() {
        RestTemplate restTemplate = new RestTemplate();
        PingDto response = restTemplate.getForObject("http://pong:8080/pong", PingDto.class);
        response.setCounter(String.valueOf(counter.incrementAndGet()));
        return response;
    }

    @GetMapping("/pingPong")
    public PingDto pingPong() {
        PingDto response;
        int i = 0;
        do {
            i++;
            RestTemplate restTemplate = new RestTemplate();
            response = restTemplate.getForObject("http://pong:8080/pong", PingDto.class);
            response.setCounter(String.valueOf(counter.incrementAndGet()));
        } while (i < 10000);
        return response;
    }
}
