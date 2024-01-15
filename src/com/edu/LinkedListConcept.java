/* LinkedList formed in Non-contiguous Memory structure.
 * LinkedList is variable or dynamic in size like ArrayList.
 * LinkedList are 3 types:  1. SingularLinkedList
                            2. DoubleLinkedList
                            3. CircularLinkedList
 * Time Complexity : insert=O(1)
                     search=O(n)   */
 

package com.edu;

import java.util.*;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<Integer> list4=new LinkedList<>();
        list4.add(3);
		list4.add(9);
	     
		LinkedList<Integer> list =new LinkedList<Integer>( );
		
		list.add(0);           // add Elements
		list.add(2);
		list.add(7);
		System.out.println(list);
		
		list.addAll(0,list4);
		System.out.println(list);
		
		list.addFirst(10);
		list.addLast(11);
		System.out.println(list);
		
	
		
		// get Element  =  obj.get(index)
		
		int element = list.get(0);
		System.out.println(element);
		System.out.println(list.get(2));
		
		// add element in between LinkedList or modify elements   obj.add(index,5)
		
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
		    
		    // LinkedList size
		    
		    System.out.println(list.size()); 
		    
		    // loop
		    
		    for(int i=0;i<list.size();i++) {
		    	System.out.print(list.get(i)+" ");
		    }
		    
		    // sort our LinkedList in ascending order
		    
		    Collections.sort(list);
		    System.out.println(list);
		    
		    
		    
		    

	}

}
