package org.example.testcontextwebclientsslissue.samples;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"x=25"})
public class Test25 {

    @Test
    void index() {
        Assertions.assertThat(true).isTrue();
    }
}
