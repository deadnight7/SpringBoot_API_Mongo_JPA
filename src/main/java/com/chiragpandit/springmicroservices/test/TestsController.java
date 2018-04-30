package com.chiragpandit.springmicroservices.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestsController {

	@RequestMapping ("/tests")
	public String getAllTests (){
		return "Hello";
		/*List <Test> tests = new ArrayList<Test>();
		Iterable <Test> testIterator = testRepository.findAll();
		for (Test test : testIterator) 
		{
			tests.add(test);
		}
		return tests;*/
	}
}
