package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		names.add("India");
		names.add("Australia");
		
		Collections.sort(names);
		
		for (String string : names) 
		{
			 System.out.println(string);
		}
		
		
		Person p1 = new Person("vaibhav", "India");
		Person p2 = new Person("John", "US");
		
		ArrayList<Person> persons = new ArrayList<>();
		
		persons.add(p1);
		persons.add(p2);
		
		Collections.sort(persons);
		
		for (Person p : persons) 
		{
			 System.out.println(p.getName());
		}
		
		System.out.println(p1.compareTo(p2));

	}

}
