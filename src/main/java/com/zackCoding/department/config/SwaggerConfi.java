package com.zackCoding.department.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfi {


    @Bean
    public Docket swaggerConfiguration(){
        //return a prepared Docket instance
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/*"))
                .apis(RequestHandlerSelectors.basePackage("com.zackCoding.department"))
                .build()
                .apiInfo(apiDetials());



    }

    private ApiInfo apiDetials (){

        return new ApiInfo("Department-User Info Service API",
                "Sample API demo for Department and user",
                "1.0.8",
                "www.zackCoding.com",
                new springfox.documentation
                        .service.Contact("Zak ait","http://zackcoding.com",
                        "zackerbeans@gmail.com"),"LICENSE",
                "http://zackCoding.com", Collections.emptyList());
                }
}
