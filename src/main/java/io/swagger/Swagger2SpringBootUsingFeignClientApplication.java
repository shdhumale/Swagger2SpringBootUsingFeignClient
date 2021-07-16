package io.swagger;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import io.swagger.controller.Swagger2SpringBootUsingFeignClientApplicationController;

@SpringBootApplication
@EnableFeignClients
public class Swagger2SpringBootUsingFeignClientApplication {


//	public static void main(String[] args) {
//		SpringApplication.run(Swagger2SpringBootUsingFeignClientApplication.class, args);
//		
//	}


	public static void main(String[] args) throws RestClientException,	IOException {
		ApplicationContext ctx =SpringApplication.run(Swagger2SpringBootUsingFeignClientApplication.class,	args);

		Swagger2SpringBootUsingFeignClientApplicationController	objSwagger2SpringBootUsingFeignClientApplicationController = ctx.getBean(Swagger2SpringBootUsingFeignClientApplicationController.class);
		System.out.println("-----------------------------------------"+objSwagger2SpringBootUsingFeignClientApplicationController);
		objSwagger2SpringBootUsingFeignClientApplicationController.testFeignClients(); 
	}



}