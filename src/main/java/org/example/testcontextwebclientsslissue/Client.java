package org.example.testcontextwebclientsslissue;

import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Client {

    private final WebClient webClient;

    public Mono<ObjectNode> getTest() {
        return webClient
            .get()
            .uri("/test")
            .retrieve()
            .bodyToMono(ObjectNode.class);
    }
}
