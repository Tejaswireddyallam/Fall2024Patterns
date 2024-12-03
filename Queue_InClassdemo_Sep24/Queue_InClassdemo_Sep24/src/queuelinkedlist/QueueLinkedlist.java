package queuelinkedlist;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
public class QueueLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> namesQue = new LinkedList();
		namesQue.add("A");namesQue.add("B");namesQue.add("C");namesQue.add("D");
		System.out.println("Names: "+namesQue);
		namesQue.remove();
		System.out.println("Names after removing: "+namesQue);
		namesQue.remove("C");
		System.out.println("Names: "+namesQue);
		System.out.println(namesQue.element());
		namesQue.remove("D");namesQue.remove("B");
		System.out.println(namesQue);
//		namesQue.remove(); 
		System.out.println(namesQue.poll());
		System.out.println(namesQue.peek());
		//convert array to queue
		String[] array = {"AA","BB","CC","DD","EE"};
		Queue<String> arrQue = new LinkedList<>();
//		arrQue.addAll(namesQue);
		
		Collections.addAll(arrQue, array);
		System.out.println(arrQue);
		
		
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		ArrayDeque<Integer> deque2 = new ArrayDeque<>();
		deque.addFirst(10);
		deque.addLast(20);
		deque.add(30);
		deque.offerFirst(5);
		deque.offerLast(35);
		Iterator<Integer> itr = deque.descendingIterator();
		while(itr.hasNext()) {
		deque2.offerFirst(itr.next());
		}
		System.out.println(deque2);
		
	}

}
