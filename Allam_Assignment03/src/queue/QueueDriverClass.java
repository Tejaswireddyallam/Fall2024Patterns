package queue;
import java.util.Scanner;

//@author  Tejaswi Allam

public class QueueDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueuesUsingLinkedList queueObject = new QueuesUsingLinkedList();
		Scanner sc = new Scanner(System.in);
		 String inputchoice = "n";  // Initially set to "n" to continue the loop
	        while (!inputchoice.equalsIgnoreCase("y")) {  // Use equalsIgnoreCase to avoid case issues
	            System.out.println("Queue using Linked List Operations \n1. Enqueue\n2. Dequeue\n3. Print\n4. Size\n5. Check Empty or not\n6. Exit");
	            System.out.println("Enter your choice: ");
	            int userinput = sc.nextInt();
	            
	            switch(userinput) {
	                case 1:
	                    System.out.println("Enter an element to insert: ");
	                    int element = sc.nextInt();
	                    queueObject.enqueue(element);
	                    break;
	                case 2:
	                    queueObject.dequeue();
	                    break;
	                case 3:
	                    queueObject.print();
	                    break;
	                case 4:
	                    int size = queueObject.size();
	                    System.out.println("Size of the queue = " + size);
	                    break;
	                case 5:
	                    boolean isEmpty = queueObject.isEmpty();
	                    if (isEmpty) {
	                        System.out.println("Queue is empty");
	                    } else {
	                        System.out.println("Queue is not empty");
	                    }
	                    break;
	                case 6:
	                    System.out.println("Do you want to exit(y/n)");
	                    inputchoice = sc.next();  // Capture the user's input
	                    break;
	                default:
	                    System.out.println("Invalid choice, please try again.");
	            }
	        }

	        System.out.println("Operations on queue are done.");
	        sc.close();
	}

}
