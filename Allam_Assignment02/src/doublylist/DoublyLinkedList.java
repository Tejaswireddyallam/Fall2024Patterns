package doublylist;

//@author  Tejaswi Allam

public class DoublyLinkedList {
	 Node head; 
	 
	//Insert newnode in double linkedlist
	public Node insertNode(Node head, Node newNode) {
        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next!= null) {
            current = current.next;
        }

        // Set the new node at the end
        current.next = newNode;
        newNode.previous = current;
        return head;
    }
	
	//print double linkedlist
	 public void print(Node head) {
	        Node current = head;
	        while (current != null) {
	            System.out.println("The student ID is: " + current.std_ID + "\nFirst Name: " + current.firstName + "\nLast Name: " + current.lastName + "\nisGraduated?: " + current.isGradOrNot + "\nAge: " + current.age + "\n******");
	            current = current.next;
	        }
	    }
	 
	 //reverse doublelinkedlist
	 
	 public void reverseList(Node head) {
	        // Traverse to the end of the list
	        Node current = head;
	        if (current == null) {
	            return;
	        }
	        while (current.next != null) {
	            current = current.next;
	        }

	        // Traverse backwards using 'previous' pointer
	        while (current != null) {
	            System.out.println("The student ID is: " + current.std_ID + "\nFirst Name: " + current.firstName + "\nLast Name: " + current.lastName + "\nisGraduated?: " + current.isGradOrNot + "\nAge: " + current.age + "\n******");
	            current = current.previous;
	        }
	    }

	
}
