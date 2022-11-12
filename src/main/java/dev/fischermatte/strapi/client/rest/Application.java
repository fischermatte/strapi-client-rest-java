package dev.fischermatte.strapi.client.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application {

    @Value("${strapi.api.token}")
    private String strapiApiToken;

    @Value("${strapi.endpoint.url}")
    private String strapiEndpointUrl;


    public static void main(String[] args) {
        var ctx = SpringApplication.run(Application.class, args);
    }

}
