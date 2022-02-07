package com.main.lifecycle;

public class HelloWorld {
	private String message;

	public void setMessage(String message) {
		System.out.println("Set Message : ");
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void init() {
		System.out.println("Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}

}
