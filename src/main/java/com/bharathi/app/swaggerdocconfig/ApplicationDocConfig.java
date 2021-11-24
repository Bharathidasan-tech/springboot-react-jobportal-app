
package com.bharathi.app.swaggerdocconfig;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author bharathidasan
 *
 */
@Profile({"!prod && swagger"})
@Configuration
@EnableSwagger2
public class ApplicationDocConfig {
	
	@Bean
	public Docket stockTradeApi() {
		
		Set<String> responsType=new HashSet<String>();
		responsType.add("application/json");
		
		return new Docket(DocumentationType.SWAGGER_2).groupName("job-portal-api")
				.select().apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.paths(PathSelectors.any()).build()
				.useDefaultResponseMessages(false)
				.genericModelSubstitutes(ResponseEntity.class)
				.produces(responsType).consumes(responsType).produces(responsType).apiInfo(apiInfo());
				
		
	}
	
	private ApiInfo apiInfo() {
		
		@SuppressWarnings("deprecation")
		ApiInfo apiInfo=new ApiInfo(
				"Job Portal API", "All Job Related Information Across Global",
				"API",
				"Terms of Services",
				"mailtobmanickam@booking.com",
				"License of MIT",
				"https://github.com/Bharathidasan-tech"
				);
		return apiInfo;
	}
	
	


}
