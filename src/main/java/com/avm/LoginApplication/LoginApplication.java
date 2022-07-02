package com.avm.LoginApplication;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"com.avm"})
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
//@EnableSwagger2
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}

	 @Bean
	  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
	    return args -> {

	      System.out.println("Let's inspect the beans provided by Spring Boot:");

	      String[] beanNames = ctx.getBeanDefinitionNames();
	      Arrays.sort(beanNames);
	      for (String beanName : beanNames) {
	        System.out.println(beanName);
	      }
	    };
	  } 
//	@Bean
//	public Docket api() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//				.apis(RequestHandlerSelectors.any())
//				.paths(PathSelectors.any())
//				.build();
//	}
}
