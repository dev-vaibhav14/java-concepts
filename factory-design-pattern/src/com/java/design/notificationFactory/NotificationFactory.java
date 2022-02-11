package com.java.design.notificationFactory;

import com.java.design.factoryImpl.EmailNotification;
import com.java.design.factoryImpl.PushNotification;
import com.java.design.factoryImpl.SmsNotification;
import com.java.design.factoryInterface.Notification;

public class NotificationFactory 
{
	
	public Notification createNotification(String channel)
	{
		if("SMS".equals(channel))
		{
			return new SmsNotification();
		}
		else if("EMAIL".equals(channel))
		{
			return new EmailNotification();
		}
		else if("PUSH".equals(channel))
		{
			return new PushNotification();
		}
		return null;
		
	}

}
