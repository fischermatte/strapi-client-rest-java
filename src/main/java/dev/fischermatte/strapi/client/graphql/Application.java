package dev.fischermatte.strapi.client.graphql;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application {

    @Value("${strapi.api.token}")
    private String strapiApiToken;


    public static void main(String[] args) {
        var ctx = SpringApplication.run(Application.class, args);
    }

}
