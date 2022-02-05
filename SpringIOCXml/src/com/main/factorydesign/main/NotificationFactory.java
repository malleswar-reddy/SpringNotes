package com.main.factorydesign.main;

import com.main.factorydesign.EmailNotification;
import com.main.factorydesign.Notification;
import com.main.factorydesign.PushNotification;
import com.main.factorydesign.SMSNotification;

public class NotificationFactory {
	public Notification createNotification(String channel) {
		if (channel == null || channel.isEmpty())
			return null;
		if ("SMS".equals(channel)) {
			return new SMSNotification();
		} else if ("EMAIL".equals(channel)) {
			return new EmailNotification();
		} else if ("PUSH".equals(channel)) {
			return new PushNotification();
		}
		return null;
	}
	
	public static void main(String[] args) {
		NotificationFactory factory = new NotificationFactory();
		
		Notification notification = factory.createNotification("EMAIL");
		notification.notifyUser();
	}
}
