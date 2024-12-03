package linkedlists;

//@author  Tejaswi Allam

public class Node {

	//create Attributes
	int std_ID;
	String firstName;
	String lastName;
	boolean isGradOrNot;
	int age;
	Node next;
	
	// Create a constructor to initialize
	
	public Node(int std_ID, String firstName, String lastName, boolean isGradOrNot, int age) {
		//super();
		this.std_ID = std_ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isGradOrNot = isGradOrNot;
		this.age = age;
		next = null;
	}
	 
	
}
