package org.example.testcontextwebclientsslissue.samples;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"x=22"})
public class Test22 {

    @Test
    void test() {
        Assertions.assertThat(true).isTrue();
    }
}
