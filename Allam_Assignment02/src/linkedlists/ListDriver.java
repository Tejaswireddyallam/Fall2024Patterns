package linkedlists;

import java.util.Scanner;

//@author  Tejaswi Allam

public class ListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SinglyLinkedList studentsList = new SinglyLinkedList();
		 Scanner sc = new Scanner(System.in);
		 //insert data for 5 students
		 for (int i = 0; i < 5; i++) {
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
         studentsList.head = studentsList.insertNode(studentsList.head, newNode);
     }
		 
		 //print linkedlist
		 System.out.println("******************************************\nStudent Details are: ");
	     studentsList.print(studentsList.head);
	     
	     //update 2 student details
	     for(int i=0;i<2;i++)
	     {
	    	 System.out.println("Enter the student ID you want to update: ");
	    	 int studentid = sc.nextInt();
	    	 System.out.println("Is the student graduated: ");
	    	 boolean isGrad = sc.nextBoolean();
	    	 studentsList.updateDetails(studentsList.head, studentid);
	    	 System.out.println("******************************************\nAfter updating " + studentid + " details");
	    	 studentsList.print(studentsList.head);
	     }
	     
	     // Linked List  swaping 3 with 5 
	     System.out.println("******************************************\nLinked List after swaping 3 with 5 is ");
	     studentsList.head = studentsList.swap(studentsList.head, 3, 5);
	     studentsList.print(studentsList.head);
	     
	     System.out.println("******************************************\nAfter swapping the student:  ");
	     studentsList.print(studentsList.head);
	     
	     //create another linkedlist 
	     SinglyLinkedList secondStudentsList = new SinglyLinkedList();
	        System.out.println("Reading inputs for second linked list: ");
	        for (int i = 0; i < 3; i++) {
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

	            Node newNode = new Node(studentid, fName, lName, isGrad, studentage);
	            secondStudentsList.head = secondStudentsList.insertNode(secondStudentsList.head, newNode);
	        }
	     
	        //merging 2 linkedlists
	        System.out.println("******************************************\nAfter merging the two linked list: ");
	        studentsList.head = studentsList.merge(studentsList.head, secondStudentsList.head);
	        studentsList.print(studentsList.head);
	        sc.close();
	}
	

}
