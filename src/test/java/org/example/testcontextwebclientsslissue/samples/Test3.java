package org.example.testcontextwebclientsslissue.samples;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

// properties
@SpringBootTest(properties = {"x=3"})
public class Test3 {

    @Test
    void test() {
        assertThat(true).isTrue();
    }
}
