package com.ust.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//We run SWAGGER_UI by http://localhost:8090/swagger-ui/index.html
@Configuration //Always indicate we need to create a bean and inject it to the program
@EnableSwagger2
//@bean annotation will be injecting those bean into the spring boot.
public class SwaggerConfig {

	
	private ApiInfo metaData() {
		return new ApiInfoBuilder().title("UST - SpringBoot Swagger Config").description("\" Swagger configuration for application\"").
				version("1.1.0").license("Apache 2.0").licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"").contact(new Contact("UST","https://youtube.com/","contact@ust.com")).build();
	}
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2).
				select().apis(RequestHandlerSelectors.
						basePackage("com.ust.rest")).paths(PathSelectors.any()).build().apiInfo(metaData());
	}
	
	
	
	
	
	
}
