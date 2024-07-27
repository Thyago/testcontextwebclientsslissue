package org.example.testcontextwebclientsslissue.samples;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


//TODO: Check this
@SpringBootTest(properties = {"x=8"})
public class Test8 {

    @Test
    void test() {
        assertThat(true).isTrue();
    }

}
