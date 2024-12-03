package linkedlist;

public class linkedlist_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creation of first node
		Node first_node = new Node(11);
		// create second node
		Node second_node = new Node(22);
		
		// address the first_node
		System.out.println("Address of first_node"+first_node);
		
		// DATA of the first_node
		System.out.println("data of first_node "+first_node.data);
		
		// NEXT of the first_node
		System.out.println("next of first_node "+first_node.next);
		
		// address the second_node
		System.out.println("\nAddress of second_node"+second_node);
				
		// DATA of the second_node
		System.out.println("data of second_node "+second_node.data);
				
		// NEXT of the second_node
		System.out.println("next of second_node "+second_node.next);
		
		// link second_node to first_node
		first_node.next = second_node;
		
		
		Node third_node = new Node(33);
		// address the third_node
		System.out.println("\nAddress of third_node"+third_node);
		// link third_node to second_node
		second_node.next = third_node;
		Node head = first_node;
		printList(first_node);
		
		
//		Creat new node and add to head 
		Node new_head =new Node(44);
		head=addFirst(first_node,new_head);
		
		Node fourth = new Node(55);
		head = addFirst(first_node,fourth);
		
		
//		after adding at the starting of the list
		System.out.println("\nAfter adding 44 at the head:");
		printList(head);
		
		Node middle = new Node(66);
		addMiddle(head,middle,22);
		
		System.out.println("\nAfter adding 66 after 22:");
		printList(head);
		
		Node end = new Node(99);
		System.out.println("\nAfter adding 99 at the end of the list:");
		addEnd(head,end);
		printList(head);
		
		 head = deleteFirst(head);
	        System.out.println("\nAfter deleting the first node:");
	        printList(head);
	        
	        deleteEnd(head);
	        System.out.println("\nAfter deleting the last node:");
	        printList(head);
	        
	        deleteMiddle(head, 66);
	        System.out.println("\nAfter deleting the node with data 66:");
	        printList(head);
		
	}
	
	public static void printList(Node current) {
		while(current!=null) {
			System.out.print(current.data+"->");
			current = current.next;
		}
		
	}
	
	public static Node addFirst(Node head,Node new_head) {
		new_head.next=head;
		return new_head;
	}
	public static void addMiddle(Node head,Node middle,int data) {
		while(head.data!=22) {
			head=head.next;
		}
		middle.next = head.next;	
		head.next = middle;
	}
	public static void addEnd(Node head,Node end) {
		while(head.next!=null) {
			head = head.next;
		}
		head.next = end;
	}
	
	public static Node deleteFirst(Node head) {
        if (head != null) {
            return head.next; // Move the head to the next node
        }
        return null;
    }

	 public static void deleteEnd(Node head) {
	        
	        Node prev = null;
	       Node current = head;

	        // Traverse to the last node
	        while (current.next != null) {
	            prev = current;
	            current = current.next;
	        }
	        
	        // Set the second last node's next to null
	        if (prev != null) {
	            prev.next = null;
	        }
	    }
	 
	 public static void deleteMiddle(Node head, int data) {
	      
	        
	        Node prev = null;
	        while (head.data != data) {
	            prev = head;
	            head = head.next;
	        }
	        
	        if (prev != null) {
	            prev.next = head.next; // Bypass the node to delete
	        }
	    }
}
