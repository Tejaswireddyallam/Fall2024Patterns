package doublelinkedlist;

public class DoubleLinkedList_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node first_node = new Node(11);
		Node second_node = new Node(22);
		Node third_node = new Node(33);
		
		first_node.prev = null;
		first_node.next = second_node;
		
		second_node.prev = first_node;
		second_node.next = third_node;
		
		third_node.prev = second_node;
		third_node.next = null;
		
		Node head = first_node;
		printList(head);
		printReverse(head);
		
		Node newnode = new Node(5);
		
		head = addFirst(head,newnode);
		printList(head);

		Node newnode1 = new Node(15);
		addLast(head,newnode1);
		
		printList(head);
		
		Node newnode2 = new Node(25);
		addMiddle(head,newnode2,22);
		
		printList(head);
		
	}
	public static void printList(Node head) {
		System.out.println("\n");
		while(head!=null) {
			System.out.print(head.data+"->");
			head=head.next;
		}
	
	
	}
	public static void printReverse(Node head) {
		System.out.println("\n");
		while(head.next!=null) {
			head=head.next;
		}
		while(head!=null) {
			System.out.print(head.data+"->");
			head=head.prev;
		}
		
	}
	
	public static Node addFirst(Node head,Node newnode) {
     
	        newnode.next = head;  // Point newnode's next to the current head
	        head.prev = newnode;  // Point current head's prev to newnode
	        return newnode;  // Return the newnode as the new head
	}
	
	public static void addLast(Node head,Node newnode) 
	{
		
	 while(head.next!= null)
	 {
		 head = head.next;
	 }
	 head.next = newnode;
	 head = newnode.prev;
	 newnode.next = null;
		
	}
	
	public static void addMiddle(Node head,Node newnode,int num)
	{
		
		
		while(head.data != num)
		{
			head = head.next;
		}
		
		Node nextnode = head.next;
		
		head.next = newnode;
		head = newnode.prev;
		newnode.next = nextnode;
	    nextnode.prev = newnode;
	}
	

}
