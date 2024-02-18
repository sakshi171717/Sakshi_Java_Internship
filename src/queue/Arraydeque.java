package queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Arraydeque {
		public static void main(String[] args) {
			ArrayDeque pq=new ArrayDeque();
			pq.add(100);
			pq.add(200);
			pq.add(300);
			pq.add(400);
			System.out.println(pq);
			pq.addFirst(600);
			System.out.println(pq);
			pq.addLast(600);
			System.out.println(pq);
			
			pq.removeFirst();
			System.out.println(pq);
			pq.removeLast();
			System.out.println(pq);
			
			
		}

}
