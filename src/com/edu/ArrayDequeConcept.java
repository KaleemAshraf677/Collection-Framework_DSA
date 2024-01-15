/* ArrayDeque is a double ended Queue.we can insert,delete,add in both the sides.
 * ArrayDeque manage automatically the size of array while we inserting or deleting anything in array
 */



package com.edu;

import java.util.ArrayDeque;

public class ArrayDequeConcept {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.add(7);
		ad.add(56);
		ad.add(9);
		ad.addFirst(5);
		System.out.println(ad);
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());

	}

}
