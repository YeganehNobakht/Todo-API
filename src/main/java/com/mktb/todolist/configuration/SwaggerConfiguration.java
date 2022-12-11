package com.mktb.todolist.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.math.BigDecimal;

/**
 * @author yeganeh
 * @created 11/12/2022 - 3:17 PM
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {


        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2).select()
                    .apis(RequestHandlerSelectors.basePackage("com.mktb.todolist.web"))
                    .paths(PathSelectors.regex("/.*"))
                    .build().directModelSubstitute(BigDecimal.class, String.class);
        }
}
