package com.giit.loans;

import com.giit.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.giit.loans.controller") })
@EnableJpaRepositories("com.giit.loans.repository")
@EntityScan("com.giit.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "GiitBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Arun kumar",
						email = "arun@gmail.com",
						url = "https://www.giitbank.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.giitbank.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "GiitBank Loans microservice REST API Documentation",
				url = "https://www.arun@giit.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {

		SpringApplication.run(LoansApplication.class, args);
		System.out.println("hi this loan module");
	}
}
