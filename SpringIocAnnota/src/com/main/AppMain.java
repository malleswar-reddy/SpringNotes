package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.main.config.AppConfiguration;
import com.main.services.PetStoreServiceImpl;

public class AppMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		
		PetStoreServiceImpl obj = (PetStoreServiceImpl) context.getBean(PetStoreServiceImpl.class);
		
		System.out.println(obj.getItemsList());
		System.out.println(obj.getUsernameList());
	}
}
