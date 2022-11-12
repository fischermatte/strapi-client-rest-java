package dev.fischermatte.strapi.client.rest;

import dev.fischermatte.strapi.client.rest.api.EmailTemplateApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
public class Application {

    @Value("${strapi.api.token}")
    private String strapiApiToken;

    @Value("${strapi.endpoint.url}")
    private String strapiEndpointUrl;

    public static void main(String[] args) {
        var ctx = SpringApplication.run(Application.class, args);
        var emailTemplateApi = ctx.getBean(EmailTemplateApi.class);
        var result = emailTemplateApi.getEmailTemplates(
                null,
                true,
                0,
                10,
                0,
                10,
                null,
                null,
                null
        );
        result.subscribe(emailTemplateListResponse -> {
            System.out.println(emailTemplateListResponse.toString());
        }, throwable -> {
            System.out.println(throwable.getMessage());
        });
    }

    @Bean
    public ApiClient apiClient() {
        var apiClient = new ApiClient();
        apiClient.setBearerToken(strapiApiToken);
        apiClient.setBasePath(strapiEndpointUrl);
        return apiClient;
    }

    @Bean
    public EmailTemplateApi emailTemplateApi(ApiClient apiClient) {
        return new EmailTemplateApi(apiClient);
    }

}
