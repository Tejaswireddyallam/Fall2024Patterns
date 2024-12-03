package stacksLinkedlist;

public class StackLinkedlist {
	public static StackNode top =null;
	public static StackNode head =top;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(11);push(22);push(33);
		printStack();
	}
	public static void push(int element) {
		
		StackNode myNode = new StackNode(element);
		top.next = myNode;
		top = myNode;
		
	}
	public static void printStack() {
		StackNode current=head;
		System.out.println("Elements in stack are: ");
		while(current!=null) {
			System.out.print(current.data);
			current = current.next;
		}
		System.out.println();
	}

}
