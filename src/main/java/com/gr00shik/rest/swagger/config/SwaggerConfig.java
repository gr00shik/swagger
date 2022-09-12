package com.gr00shik.rest.swagger.config;

import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    GroupedOpenApi usersGroup() {
        return GroupedOpenApi.builder()
                .group("project-user-service")
                .pathsToMatch("/api/v1/user/**")
                .displayName("User group")
                .addOpenApiCustomiser(openApi -> {
                    openApi.setInfo(new Info()
                            .title("Service User Group")
                            .description("This is rest endpoint for operation with user"));
                        }
                )
                .build();
    }

    @Bean
    GroupedOpenApi actuatorGroup() {
        return GroupedOpenApi.builder()
                .group("project-actuator")
                .pathsToMatch("/actuator/**")
                .displayName("Actuator group")
                .addOpenApiCustomiser(openApi -> {
                            openApi.setInfo(new Info()
                                    .title("Actuator")
                                    .description("This is actuators endpoints for User service"));
                        }
                )
                .build();
    }

}
