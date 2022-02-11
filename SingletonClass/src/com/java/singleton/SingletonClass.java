package com.java.singleton;

public class SingletonClass
{

	private static SingletonClass singleton_object;
	
	private SingletonClass()
	{
		System.out.println("In constructor");
	}
	
	
	public static SingletonClass getInstance()
	{
		if(singleton_object == null)
			singleton_object = new SingletonClass();
		
		return singleton_object;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
	}

}
