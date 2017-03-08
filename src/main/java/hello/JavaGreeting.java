package hello;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@AllArgsConstructor
@Getter
@Setter
public class JavaGreeting implements Greeting {
    private String name;
    private long count;
}
