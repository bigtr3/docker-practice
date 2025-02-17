package com.example.practice.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("게시물 API")
                        .description("Swagger로 테스트하는 게시물 등록 및 조회 API")
                        .version("1.0.0"));
    }
}
