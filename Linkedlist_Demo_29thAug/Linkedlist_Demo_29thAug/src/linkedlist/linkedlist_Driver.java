package linkedlist;

public class linkedlist_Driver {

    public static void main(String[] args) {
        // Creation of first node
        Node first_node = new Node(11);
        // Create second node
        Node second_node = new Node(22);
        
        // Address of the first_node
        System.out.println("Address of first_node: " + first_node);
        
        // Data of the first_node
        System.out.println("Data of first_node: " + first_node.data);
        
        // Next of the first_node
        System.out.println("Next of first_node: " + first_node.next);
        
        // Address of the second_node
        System.out.println("\nAddress of second_node: " + second_node);
                
        // Data of the second_node
        System.out.println("Data of second_node: " + second_node.data);
                
        // Next of the second_node
        System.out.println("Next of second_node: " + second_node.next);
        
        // Link second_node to first_node
        first_node.next = second_node;
        
        Node third_node = new Node(33);
        // Address of the third_node
        System.out.println("\nAddress of third_node: " + third_node);
        // Link third_node to second_node
        second_node.next = third_node;
        
        Node head = first_node;
        printList(head);  // Print the linked list
        
        Node new_node = new Node(1);
        head = addFirst(head, new_node);  // Add new_node at the beginning
        
        Node new_node_at_end = new Node(44);
        head = addLast(head, new_node_at_end);
        
        Node new_node_in_middle = new Node(55);
        head = addMiddle(head, new_node_in_middle, 2);
        
       // System.out.println("\nAfter adding new node at the beginning:");
        printList(head);  // Print the updated linked list
    }
    
    public static void printList(Node current) {
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public static Node addFirst(Node head, Node new_node) {
       new_node.next = head;
       return new_node; // Return the new head of the list\
    }
    
    public static Node addLast(Node head, Node new_node_at_end ) {
    
    Node current = head;
    while (current.next != null) {
        current = current.next;  // Traverse to the end of the list
    }
    
    current.next =  new_node_at_end;  // Link the last node to the new_node
    return head;  // Return the head of the list
}
    public static Node addMiddle(Node head, Node new_node_in_middle, int position)
    {
    	 Node current = head;
         for (int i = 0; i < position - 1 && current != null; i++) {
             current = current.next;  // Traverse to the node before the desired position
         }
         
         if (current == null) {
             System.out.println("Position is out of bounds.");
             return head;
         }
         
         new_node_in_middle.next = current.next;  // Link new_node to the next node
         current.next = new_node_in_middle; // Link current node to the new_node;
         return new_node_in_middle;
         
    }
}