package queuepack;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {

		//FIFO
		//priorityqueue class will sort data for us
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();

		
		for(int i=10;i>0;i--) {
			
			q.add(i);
			
		}
		System.out.println("q size ===="+q.size());
		System.out.println("elements present in q ======"+q);
		int peek=q.peek();
		System.out.println("peek==head of queue============"+peek);
		q.poll();
		System.out.println("q size ===after polling=========="+q.size());

		System.out.println("elements present in q after polling======"+q);
		int peekafter=q.peek();
		System.out.println("peek==head of queue====after polling========"+peekafter);

		
	}

}
