package com.java.enums;

public class EnumsDemo {
	
	//An enum is a special type of data type which is basically a collection (set) of constants. 
	
	// Enums in java are mainly used for grouping similar kind of constants as a one unit. constants means static and final.
	
	//Duplicate enum constants are not allowed.
	
	//Every constant of enum is public, static and final by default.
	
	//Enums can have any number of fields. methods and constructors and Each constant will have their own copy of fields and methods.
	//If enum has only constants, then semicolon (;) at the end of constant declaration is not mandatory. But, if enum has other members, then semicolon is mandatory.
	
	/*
	 * Every enum in java extends java.lang.Enum class. Enum class is an abstract
	 * class in java.lang package. As every enum extends Enum class, it should not
	 * extend any other class. Because, Multiple inheritance is not allowed in java.
	 * But enums can implement any number of interfaces.
	 * 
	 */
	
	// Enums can be declared inside a class. If declared inside a class, they are static by default and can be accessed directly by Class name.
	
	//Enum constants can override generalized method defined in the enum body.
	
	//Enum can have abstract method declared in it’s body provided each enum constants must implement it.
	
	//Enum Constants can have their own fields and method defined in their body, but these fields and methods are visible only within the constant body.
	
	
	enum Days
	{
	    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
