package queue;

//@author  Tejaswi Allam
public class QueuesUsingLinkedList {
	
	private Node head; 
    private int size; 
     
    // create a constructor
    public QueuesUsingLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    // performing enqueue
    public void enqueue(int x) {
    	//create a newnode
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
            	current = current.next;
            }
            current.next = newNode;
        }
        size++;
        System.out.println(x + " is inserted into the queue");
    }
    
    //performing dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removeData = head.data;
        head = head.next;
        size--;
        System.out.println(removeData + " is removed from the queue");
        return removeData;
    }
    
    //check isempty
    public boolean isEmpty() {
        return head == null; //returns true if queue is empty
        }
    
    // checks the size of the queue
    public int size() {
        return size;
    }
    
 // Print the queue
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            Node current = head;
            System.out.print("Elements in queue: [");
            while (current != null) {
                System.out.print(current.data);
                if (current.next != null) {
                    System.out.print(", ");
                }
                current = current.next;
            }
            System.out.println("]");
        }
    }
}
