package linkedlists;

//@author  Tejaswi Allam

public class SinglyLinkedList {
	
	Node head;
	
	public Node insertNode(Node head, Node newNode) {
		 Node current = head;
		 if (head == null) {
		        return newNode;
		    }
		    while (current.next != null) {
		        current = current.next;  // Traverse to the end of the list
		    }
		    
		    current.next =  newNode;  // Link the last node to the newnode
		    return head;  // Return the head of the list
	}
	
	public Node updateDetails(Node head, int studentID) {
	    Node current = head;
	    
	    while (current != null) {
	        if (current.std_ID == studentID) {
	            // change the value of isGradOrNot (if true set to false, and vice versa)
	            current.isGradOrNot = !current.isGradOrNot;
	            break;
	        }
	        current = current.next;
	    }
	    return head;// Return the head of the list
	}
	
	 public void print(Node head) {
	        Node current = head;
	        while (current != null) {
	        	System.out.println("The student ID is: " + current.std_ID + "\nFirst Name: " + current.firstName + "\nLast Name: " + current.lastName);
	        	System.out.println("isGraduated?: " + current.isGradOrNot + "\nAge: " + current.age + "\n******");
	            current = current.next;
	        }
	    }
	 
	 public Node swap(Node head, int id1, int id2) {
		 if (head == null || head.next == null) 
		 {
			 return head;
		 }
		 
		 // Remove5th student
		 
		    Node previous = null, current = head;
		    Node node2 = null; // To store the node with id2
		    
		 // Traverse to find and remove node with id2
		    while (current != null && current.std_ID != id2) {
		        previous = current;
		        current = current.next;
		    }
		    
		    if (current != null) {
		        node2 = current; // Found the node with id2
		        if (previous != null) {
		            previous.next = current.next;
		        }

		        if (head.std_ID == id2) {
		            head = current.next;
		        }
		        node2.next = null; // remove the node
		    }
		    // Insert node2 after node with id1
		    current = head;
		    while (current != null && current.std_ID != id1) {
		        current = current.next;
		    }

		    if (current != null && node2 != null) {
		        node2.next = current.next;
		        current.next = node2; // Insert node2 after node1
		    }

		    // Step 2: Remove 3rd student (id1) and insert it at the end of the list
		    previous = null;
		    current = head;
		    Node node1 = null;

		    // Traverse to find and remove node with id1
		    while (current != null && current.std_ID != id1) {
		        previous = current;
		        current = current.next;
		    }

		    if (current != null) {
		        node1 = current; // Found the node with id1
		        if (previous != null) {
		            previous.next = current.next;
		        }

		        if (head.std_ID == id1) {
		            head = current.next;
		        }
		        node1.next = null; // remove the node
		    }

		    // Traverse to the end of the list
		    current = head;
		    if (current != null) {
		        while (current.next != null) {
		            current = current.next;
		        }
		        // Insert node1 at the end of the list
		        if (node1 != null) {
		            current.next = node1;
		        }
		    }

		    return head; // Return the updated head
	 }
	 
	 public Node merge(Node list1, Node list2) {
	        if (list1 == null) return list2;
	        if (list2 == null) return list1;

	        Node current = list1;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = list2;

	        return list1;
	    }
	 
}
