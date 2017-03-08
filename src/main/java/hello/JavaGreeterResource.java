package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class JavaGreeterResource implements Greeter {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/java")
    @Override
    public Greeting greet() {
        return new JavaGreeting("  Java Hello", counter.incrementAndGet());
    }

}
