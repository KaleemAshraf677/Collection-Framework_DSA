 // Queue is an Line basically in which First In First Out Concept Apply
// we can use Array,LinkedList,ArrayDeque as a Queue.

package com.edu;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueConcept {

	public static void main(String[] args) {
		//Queue<Integer> q=new LinkedList<Integer>();  //Queue is an interface thats why we cannot make object of Queue
		Queue<Integer> Q=new ArrayDeque<>();  // ArrayDeque or LinkedList class Inherit this Queue Interface Thats why we can make objects in between while using Queue Interface
         Q.add(1);
         Q.add(2);
         Q.add(3);
         Q.add(4);
         Q.add(5);
         
         while(!Q.isEmpty()) {
        	 System.out.println(Q.peek());
        	 Q.remove();
         }
	}

}
