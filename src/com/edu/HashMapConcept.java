// In HashMap we can Store a pair of data in which Key and Value both can be stored.
// Implementation of HashMap will be stored in ArrayList of LinkedList.
package com.edu;

import java.util.*;

public class HashMapConcept {

	public static void main(String[] args) {
		
	//	HashMap<key_datatype,value_datatype> map=new HashMap<>();
		HashMap<String,Integer> map=new HashMap<>();
		
	// Insertion
		
		map.put("India",143);
		map.put("US",34);
		map.put("China",140);
		
		System.out.println(map);
		
	// Insert Again China key
		map.put("China", 143);
		
	// Searching
		if(map.containsKey("Indonesia"))
			System.out.println("Key is present in HashMap");
		else
			System.out.println("Key is not present in HashMap");
		
		// HashMap Iteraton Method 1
		
		for(Map.Entry<String,Integer> e: map.entrySet()) {
			System.out.println(e.getKey()+"="+e.getValue());	
		}
		
	// delete
		map.remove("China");
		System.out.println(map);
		
	}

}
