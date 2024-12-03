package priorityqueue;

import java.util.*;
public class PriorityQu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq1 = new PriorityQueue();
		Queue<Integer> pq2 = new PriorityQueue();
		
		pq1.add(2);pq1.add(3);pq1.add(1);pq1.add(5);
		System.out.println(pq1);
		System.out.println(pq1);
		System.out.println(pq1.peek());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		System.out.println(pq1.remove());
		
		System.out.println("priority queue using comparator");
		PriorityQueue<Integer> pq3 = new PriorityQueue(Comparator.reverseOrder());
		pq3.add(2);pq3.add(3);pq3.add(1);pq3.add(5);
		System.out.println(pq3);
		

		
	}

}
