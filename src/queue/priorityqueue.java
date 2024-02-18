package queue;

import java.util.PriorityQueue;

public class priorityqueue {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.offer(100);
		pq.offer(200);
		pq.offer(300);
		pq.offer(400);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.remove();
		System.out.println(pq);
		
		PriorityQueue pq1=new PriorityQueue();
		pq1.poll();
		System.out.println(pq1);
		pq1.remove();
		System.out.println(pq1);
		
		
	}

}
