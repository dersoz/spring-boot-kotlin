package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    private static final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public String index() {
        return "Hello World! Count: " + counter.incrementAndGet();
    }

}
