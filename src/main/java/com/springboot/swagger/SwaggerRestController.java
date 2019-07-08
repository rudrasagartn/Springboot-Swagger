package com.springboot.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class SwaggerRestController {

	@ApiOperation(value = "Say Hello")
	@RequestMapping(method = RequestMethod.GET, value = "/rest-api/")
	public String sayHello() {
		return "Swagger Hello World";
	}

	@ApiOperation(value = "List All Operation", response = List.class)
	@RequestMapping(method = RequestMethod.GET, value = "/rest-api/getAll")
	public List<String> getAll() {
		List<String> lst = new ArrayList<>();
		lst.add("One");
		lst.add("Two");
		return lst;
	}
}