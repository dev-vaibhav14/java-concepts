package com.java.generics;

public class GenericWithWildcards {

	
	/*
	 * In generic code, the question mark (?), called the wildcard, represents an
	 * unknown type. A wildcard parameterized type is an instantiation of a generic
	 * type where at least one type argument is a wildcard. Examples of wildcard
	 * parameterized types are Collection<?<, List<? extends Number<, Comparator<?
	 * super String> and Pair<String,?>.
	 */
	
	// The wildcard is never used as a type argument for a generic method invocation, a generic class instance creation, or a supertype.
	
	
	// upperbound wildcards
	// lowerbound wildcards
	
	//we can specify that a method accepts a type and all its subclasses (upper bound) or a type and all its superclasses (lower bound).
	
	/*
	 * not allowed with generics 
	 * a) You can’t have static field of type
	 * b) You can not create an instance of T
	 * c) Generics are not compatible with primitives in declarations
	 * d) You can’t create Generic exception class
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
