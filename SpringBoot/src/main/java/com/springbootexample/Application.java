package com.springbootexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springbootexample.bSearch.SpringSearchApp;

@SpringBootApplication
public class Application {
    static SpringSearchApp searchService=null;
    static ApplicationContext context=null;
    private static Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		logger.debug("before caling run");
		context=SpringApplication.run(Application.class, args);
		searchService=context.getBean(SpringSearchApp.class);
		searchService.search();
		logger.debug("after caling run");
	}

}
