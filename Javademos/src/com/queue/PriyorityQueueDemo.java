package com.queue;

import java.util.PriorityQueue;

public class PriyorityQueueDemo {

	public static void main(String[] args) {
		 PriorityQueue<Integer> pqueue = new PriorityQueue<>();

	        // Using the add() method
	        pqueue.add(4);
	        pqueue.add(2);
	        System.out.println("PriorityQueue: " + pqueue);

	        // Using the offer() method
	        pqueue.offer(1);
	        System.out.println("Updated PriorityQueue: " + pqueue);
	    }
	

}