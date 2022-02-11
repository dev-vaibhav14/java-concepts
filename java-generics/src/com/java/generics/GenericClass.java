package com.java.generics;

public class GenericClass<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public GenericClass(T t) {
		super();
		this.t = t;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GenericClass gc = new GenericClass(123);
		System.out.println(gc.getT());
	}

}
