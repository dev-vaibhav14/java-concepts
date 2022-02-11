package com.java.immutable;

import java.util.HashMap;
import java.util.Map;

final class ImmutableClass 
{

	private final int id;
	
	private final String name ;
	
	private final Map<String, String> entryMap;
	
	
	public ImmutableClass(int id, String name, Map<String, String> entryMap)
	{
		this.id = id;
		this.name = name;
		
		  Map<String, String> tempMap = new HashMap<>();
		  for (Map.Entry<String, String> entry :
			  entryMap.entrySet()) {
	            tempMap.put(entry.getKey(), entry.getValue());
	        }
	 
	        this.entryMap = tempMap;
		  
	}
	
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public Map<String, String> getEntryMap() {
		  Map<String, String> tempMap = new HashMap<>();
		  
	        for (Map.Entry<String, String> entry :
	             this.entryMap.entrySet()) {
	            tempMap.put(entry.getKey(), entry.getValue());
	        }
	        return tempMap;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
