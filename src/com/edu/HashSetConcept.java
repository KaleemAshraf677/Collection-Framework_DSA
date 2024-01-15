package com.edu;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {

	public static void main(String[] args) {
		
		HashSet<Integer> set=new HashSet<>(); //In HashSet(Data Structure) only Unique value can be stored.
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);
		set.add(4);
		
		System.out.println(set.size());
		System.out.println(set);
		
		//Searching in set
		
		if(set.contains(1))
			System.out.println("1 is Present in set");
		if(!set.contains(5))
			System.out.println("5 is not Present in set");
		
		//delete
		set.remove(1);
		System.out.println(set);
		
		//Iterator - HashSet does not have an order it iterate random value not sorted value.
		Iterator I=set.iterator();
		
		while(I.hasNext()) {
			System.out.println(I.next());
		}
		
		//set.isEmpty()
   
		if(!set.isEmpty())
    	System.out.println("Not an Empty Set..");
		
		
		
		
       
	}

}
