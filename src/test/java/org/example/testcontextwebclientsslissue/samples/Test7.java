package org.example.testcontextwebclientsslissue.samples;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(properties = "x=7")
public class Test7 {
    @Test
    void test() {
        assertThat(true).isTrue();
    }
}
