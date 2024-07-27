package org.example.testcontextwebclientsslissue.samples;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"x=10"})
public class Test10 {
    @Test
    void index() {
        Assertions.assertThat(true).isTrue();
    }
}
