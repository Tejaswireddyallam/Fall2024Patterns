package linkedlistJCF;
import java.util.*;

public class LinkedListJCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> llist1 = new LinkedList<>();
		
		ArrayList<String> arrayList1 = new ArrayList<>();
		
		List<String> llist2 = new LinkedList<>();
		
		List<String> arraylist2 = new ArrayList<>();
		
		llist1.add("Fellah"); llist1.add("Thiru"); llist1.add("Darren"); llist1.add("Ram");
		System.out.println("Linked list 1: "+ llist1);
		llist1.addFirst("Ajay"); llist1.addLast("Raju");
		System.out.println("Linked list after adding at the first and last 1: "+ llist1);
		llist1.remove("Fellah");
		System.out.println("Linked list after removing fellah: "+ llist1);
		llist1.add(2, "Sai");
		
		System.out.println("After adding at index 2"+ llist1);
		
		llist1.set(1, "thirupathi");
		
		System.out.println("After setting the 1st object:"+ llist1);
		
		System.out.println("size of linkedlist is"+ llist1.size());
		System.out.println("Check whether list is empty:"+llist1.isEmpty());
		System.out.println("check the list contains thirupathi: "+llist1.contains("thirupathi"));
		
		Iterator itr1 = llist1.iterator();
		
		while(itr1.hasNext()) {
//			System.out.print(itr1.next()+" ");
			itr1.next();
		}
		
		LinkedList<String> list2 = new LinkedList<>();
		Iterator itr2 = list2.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
		
		System.out.println("\n"+ itr2.hasNext());

	}

}
