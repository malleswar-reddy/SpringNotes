package com.main.factorydesign;

public class FactoryMain {

	public static void main(String[] args) {
	       
		Notification  notification =	FactoryMain.getFactory("Email");
		notification.notifyUser();
		

	}
	
	public static  Notification getFactory(String message) {
		
		if(message.equalsIgnoreCase("SMS"))
		    return new SMSNotification();
		if(message.equalsIgnoreCase("Email"))
		    return new EmailNotification();
		
		return null;
		
	}

}
