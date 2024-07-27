package org.example.testcontextwebclientsslissue;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientSsl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@RequiredArgsConstructor
public class WebClientConfig {

    private final WebClientSsl webClientSsl;

    @Bean("cmdsWebClient")
    public WebClient webClient() {
        return WebClient.builder()
            .baseUrl("http://localhost:11112")
            // By simple adding the use of WebClientSsl bundle here, the test will fail
            // if tests reaches the limit of 32 test contexts
            .apply(webClientSsl.fromBundle("default"))
            .build();
    }
}
