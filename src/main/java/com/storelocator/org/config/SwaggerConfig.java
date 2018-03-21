package com.storelocator.org.config;


import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket depositSlipApi() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.storelocator.org.controller")).paths(paths()).build()
				.apiInfo(metaData());

	}

	private ApiInfo metaData() {
		ApiInfo apiInfo = new ApiInfo("API Documentation", "REST API Documentation", "1.0",
				"Terms of service", "Arpit Kumar", "www.arpitguta.com", "arpit-k@hcl.com");
		return apiInfo;
	}

	private Predicate<String> paths() {
		return or(regex("/locations.*"), regex("/storelocator.*"));
	}
}