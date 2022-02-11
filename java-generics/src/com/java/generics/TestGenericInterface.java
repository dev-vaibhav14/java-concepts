package com.java.generics;

public class TestGenericInterface implements GenericInterface<String, Integer> 
{

	@Override
	public String getT1(String t) {
		// TODO Auto-generated method stub
		return t;
	}

	public Integer getT2(String t) {
		// TODO Auto-generated method stub
		return 123;
	}

	@Override
	public Integer getT2(Integer t) {
		// TODO Auto-generated method stub
		return null;
	}

}
