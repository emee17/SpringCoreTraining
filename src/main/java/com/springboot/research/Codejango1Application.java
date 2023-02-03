package com.springboot.research;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //This Annotation is used to make the application as Spring boot Application
public class Codejango1Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cg =  SpringApplication.run(Codejango1Application.class, args);
		//Application Context Container is nothing but IoC container
		// There are 2 types of container 
		//1. IoC (Application Context Container)
		//2. BeanFactory 
		
		//BeanFactory // it only support XML configuration //it doesnt support internationalization
		//ApplicationContext supports both XML and Annotation // it support support internationalization
		
		//When to use @Qualifier and @Primary
		// When you have need Dependency injection at multiple classes and 
		//you need different type of injecttion the we use @Qualifier
		//When we want to set a Bean as a Primary Injection then we will use @Primary
		
		
		
		//System.out.println("Spring Boot Application");
		
		
		
		DellLaptop dl = cg.getBean(DellLaptop.class);
		
		
		dl.setRAM("8GB");
		dl.setStorage("200GB");
		
		System.out.println(dl);
		
		
		DellLaptop dl2 = cg.getBean(DellLaptop.class);
		
		
		System.out.println(dl2);
		
		
		//IntelProcessor intelProcessor = cg.getBean(IntelProcessor.class);
		
		//intelProcessor.setPropertyA(9);
		
		//Processor intelProcessor = new IntelProcessor();
		
		//dl.setProcessor(intelProcessor);
		
		
		
		
		HpLaptop hl = cg.getBean(HpLaptop.class);
		
		hl.setRAM("12GB");
		hl.setStorage("500GB");
		
		//System.out.println(hl);
	}

}
