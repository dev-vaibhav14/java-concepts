package com.java.design.factoryImpl;

import com.java.design.factoryInterface.Notification;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		// TODO Auto-generated method stub
		System.out.println("PUSH");

	}

}
