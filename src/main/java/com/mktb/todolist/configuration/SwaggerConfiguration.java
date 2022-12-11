package com.mktb.todolist.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

/**
 * @author yeganeh
 * @created 11/12/2022 - 3:17 PM
 */
@Configuration
public class SwaggerConfiguration {


        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2).select()
                    .apis(RequestHandlerSelectors.basePackage("com.behsazan.didehBank.controller"))
                    .paths(PathSelectors.regex("/.*"))
                    .build().directModelSubstitute(BigDecimal.class, String.class);
        }
}
