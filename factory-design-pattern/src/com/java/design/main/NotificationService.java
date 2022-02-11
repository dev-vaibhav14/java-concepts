package com.java.design.main;

import com.java.design.factoryInterface.Notification;
import com.java.design.notificationFactory.NotificationFactory;

public class NotificationService {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		NotificationFactory nf = new NotificationFactory();
		Notification notificaiton = nf.createNotification("SMS");
		notificaiton.notifyUser();
		

	}

}
