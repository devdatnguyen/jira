package vn.monia.jira.config;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public Docket getDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("vn.monia.jira"))
				.build()
				.apiInfo(new ApiInfoBuilder().title("Jira Application")
						.version("1.0.0")
						.description("This is project is used control task")
						.contact(new Contact("Quoc Dat Nguyen", "monia.vn", "iamdatkao@gmail.com"))
						.build());
	}
}
