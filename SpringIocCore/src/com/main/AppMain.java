package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.main.bean.DBConnection;
import com.main.config.AppConfiguration;

public class AppMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		context.scan("com.main");

		System.out.println("Refreshing the spring context");
		DBConnection dbConnection = context.getBean(DBConnection.class);

		dbConnection.printDBConfigs();
		// close the spring context
		context.close();

	}
}
