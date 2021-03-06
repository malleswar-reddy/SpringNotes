package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.lifecycle.HelloWorld;

public class BeanLifeCycleCheck {

	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		HelloWorld obj = context.getBean("helloWorld",HelloWorld.class);
		Thread.sleep(1000);
		obj.getMessage();
		Thread.sleep(1000);
		context.registerShutdownHook();
	}

}
