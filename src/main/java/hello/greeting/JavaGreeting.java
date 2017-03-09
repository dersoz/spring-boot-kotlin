package hello.greeting;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
@ToString
public class JavaGreeting implements Greeting {
    private String name;
    private long count;
}
