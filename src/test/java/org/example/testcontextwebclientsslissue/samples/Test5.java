package org.example.testcontextwebclientsslissue.samples;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "x=5")
public class Test5 {

    @Test
    void test() {
        Assertions.assertThat(true).isTrue();
    }
}
