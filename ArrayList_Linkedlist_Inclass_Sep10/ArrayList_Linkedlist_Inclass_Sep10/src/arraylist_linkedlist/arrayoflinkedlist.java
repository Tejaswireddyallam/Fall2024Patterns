package arraylist_linkedlist;
import java.util.*;

public class arrayoflinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> oddlist = new LinkedList<>();
		LinkedList<Integer> evenlist = new LinkedList<>();
		oddlist.add(1);oddlist.add(3);oddlist.add(5);oddlist.add(7);
		evenlist.add(2);evenlist.add(4);evenlist.add(6);evenlist.add(8);
		
		LinkedList<Integer>[] list = new LinkedList[2];
		list[0] = oddlist;
		list[1] = evenlist;
		System.out.println(list[0]);
		System.out.println(list[1]);
		
	}

}
