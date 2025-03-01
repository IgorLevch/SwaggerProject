package com.example.demo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Configuration class for setting up Swagger/OpenAPI documentation
 * <p>
 * This class defines the settings for generating API documentation,
 * including main API metadata.
 */
@Configuration
public class SwaggerConfig {

    /**
     * Creates and configures an OpenAPI component for generating API documentation.
     *
     * @return a configured OpenAPI instance containing server information
     * and API metadata.
     */
    @Bean
    public OpenAPI api() {
        return new OpenAPI()

                .info(
                        new Info()
                                .title("Demo Contact System API")
                );
    }
}