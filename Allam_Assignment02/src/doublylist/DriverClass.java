package doublylist;

//@author  Tejaswi Allam
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DoublyLinkedList doublylinkedlist = new DoublyLinkedList();
		 Scanner sc = new Scanner(System.in);
		 for (int i = 0; i < 6; i++) {
			 System.out.print("Enter student ID: ");
	         int studentid = sc.nextInt();
	         System.out.print("Enter first name: ");
	         String fName = sc.next();
	         System.out.print("Enter last name: ");
	         String lName = sc.next();
	         System.out.print("Enter student is graduated?: ");
	         boolean isGrad = sc.nextBoolean();
	         System.out.print("Enter student age: ");
	         int studentage = sc.nextInt();
	         
	         //Inserting student Nodes into list
	         Node newNode = new Node(studentid, fName, lName, isGrad, studentage);
	         doublylinkedlist.head = doublylinkedlist.insertNode(doublylinkedlist.head, newNode);
	     }
		 
		 System.out.println("******************************************\nDoubly Linked List: ");
	     doublylinkedlist.print(doublylinkedlist.head);
	     
	     System.out.println("******************************************\nThe linked list printed in reverse order is: ");
	     doublylinkedlist.reverseList(doublylinkedlist.head);
	     
	     sc.close();
	}

}
