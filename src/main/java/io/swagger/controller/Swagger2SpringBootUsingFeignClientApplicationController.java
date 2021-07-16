package io.swagger.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import io.swagger.api.IndexControllerApiClient;
import io.swagger.model.Employee;

@RestController
public class Swagger2SpringBootUsingFeignClientApplicationController {
	
	@Autowired
	private IndexControllerApiClient objIndexControllerApiClient;


	public void testFeignClients()throws RestClientException, IOException 
	{
	
		ResponseEntity<Employee> objResponseEntity = objIndexControllerApiClient.getEmployeeUsingGET(); 
		System.out.println("objResponseEntity.toString():"+objResponseEntity.toString());
	}
}