package org.example.testcontextwebclientsslissue.samples;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"x=30"})
public class Test30 {
    //@SpyBean
    //OutboundEventMonitoring outboundEventMonitoring;

    @Test
    void test() {
        Assertions.assertThat(true).isTrue();
    }
}
