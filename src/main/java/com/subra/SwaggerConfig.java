package com.subra;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created by sdass on 3/30/2017.
 * good guide https://indrabasak.wordpress.com/2016/04/07/swagger-2-integration-with-spring-rest/
 *
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /*@Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build();
    }

    private Predicate<String> postPaths() {
        return or(regex("/api/posts.*"), regex("/api/hello.*"), regex("/"));
    }

    */

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.any()).build();
    }



    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("JavaInUse API")
                .description("Hello API reference for developers")
                .termsOfServiceUrl("http://localhost.com")
                .contact("sdass@drf.com").license("Free")
                .licenseUrl("sdass@drf.com").version("0.0.1").build();
    }

}
