package hello.greeter

import hello.greeting.Greeting
import hello.greeting.KotlinGreeting
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class KotlinGreeterResource : Greeter {

    private val counter = AtomicLong()

    @RequestMapping("/kotlin")
    override fun greet(): Greeting = KotlinGreeting("Kotlin Hello", counter.incrementAndGet())

}