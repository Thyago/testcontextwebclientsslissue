package org.example.testcontextwebclientsslissue.samples;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.SneakyThrows;
import org.assertj.core.api.Assertions;
import org.example.testcontextwebclientsslissue.Client;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.JsonBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import reactor.test.StepVerifier;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class WebClientTest {

    @Autowired
    Client client;

    @Test
    @SneakyThrows
    void getTest_exists_returnResponse() {
        // given
        var responseData = new ObjectMapper().readValue("{ \"response\": \"ok\" }", ObjectNode.class);

        try (var mockServerClient = ClientAndServer.startClientAndServer(11112)) {

            // when
            mockServerClient
                .when(request()
                    .withMethod(HttpMethod.GET.name())
                    .withPath("/test"))
                .respond(response()
                    .withStatusCode(HttpStatus.OK.value())
                    .withBody(new JsonBody(responseData.toString())));

            // when/then
            StepVerifier
                .create(client.getTest())
                .consumeNextWith(response -> Assertions.assertThat(response).isEqualTo(responseData))
                .verifyComplete();

            mockServerClient.stop();
        }
    }
}
