/* There are 2 types of List: 1.ArrayList   2.LinkedList
 
 Properties Of ArrayList:
 
 * Size of an Array is fixed while in ArrayList size is in Variable(dynamic) form.  
 * We can use Integer Class,String Class,Float Class,Boolean,Generic Type etc Classes  to store the value in ArrayList.                               
 * Time Complexity in ArrayList:
                              Insert= O(n)
                              Search= O(1)          */

package com.edu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListConcepts {

	public static void main(String[] args) {
	
	//  ArrayList<Boolean> list3= new ArrayList<>();	
	// ArrayList<String> list2=new ArrayList<String>();	
	//	ArrayList<Float> list=new ArrayList<>();
	    
		List<Integer> list4=new ArrayList<>(5);
        list4.add(3);
		list4.add(9);
	     
		ArrayList<Integer> list =new ArrayList<Integer>( );
		
		list.add(0);           // add Elements
		list.add(2);
		list.add(7);
		System.out.println(list);
		
		list.addAll(0,list4);
		System.out.println(list);
		
		// get Element  =  obj.get(index)
		
		int element = list.get(0);
		System.out.println(element);
		System.out.println(list.get(2));
		
		// add element in between ArrayList or modify elements   obj.add(index,5)
		
		    list.add(0,1);
		    list.add(2,5);
		    
		    System.out.println(list);
		    
		   // set Element = obj.set(index,7) 
		    
		    list.set(0,3);
		    list.set(3,9);
		    System.out.println(list);
		    
		    // delete or remove Element      obj.remove(index)
		    
		    list.remove(1);
		    list.remove(3);
		    System.out.println(list);
		    
		    // ArrayList size
		    
		    System.out.println(list.size()); 
		    
		    // loop
		    
		    for(int i=0;i<list.size();i++) {
		    	System.out.print(list.get(i)+" ");
		    }
		    
		    // sort our ArrayList in ascending order
		    
		    Collections.sort(list);
		    System.out.println(list);
		    
		    
		    
		    
		    
		    
		    

	}

} 
