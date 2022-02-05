package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.main.constructordi.Transmission;
import com.main.services.PetStoreServiceImpl;
import com.main.setterbaseed.TransmissionSetter;

public class ApplicationContextExam {

	public static void main(String[] args) {
		// create and configure beans
		@SuppressWarnings("resource")
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		
		//ApplicationContext context = new FileSystemXmlApplicationContext(new String[] { "C:\\Users\\admin\\workspace\\SpringIOCXml\\src\\applicationContext.xml" });

		// retrieve configured instance
		PetStoreServiceImpl service = context.getBean("petStore", PetStoreServiceImpl.class);
		System.out.println(service.getItemsList());
		System.out.println(service.getUsernameList());
		System.out.println(service.getImageFormats());

		System.out.println("constructor-based dependency injection");
		Transmission transmission = context.getBean("transmission", Transmission.class);
		System.out.println(transmission.getName());

		System.out.println("Setter-Based Dependency Injection");
		TransmissionSetter transmissionSetter = context.getBean("setitem", TransmissionSetter.class);
		System.out.println(transmissionSetter.getItem());

	}

}
