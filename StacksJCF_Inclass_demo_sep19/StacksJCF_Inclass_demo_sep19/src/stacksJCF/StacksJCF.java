package stacksJCF;
import java.util.Stack;
import java.util.Vector;

public class StacksJCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> myStack = new Stack<>();
		Vector<Integer> mystack2 = new Stack<>();
		myStack.push(11);myStack.push(22);myStack.push(33);
		mystack2.add(2);mystack2.add(4);mystack2.add(5);
		
		System.out.println("myStack is: "+ myStack);
		System.out.println("myStack2 is: "+ mystack2);
		mystack2.remove(Integer.valueOf(4));
		System.out.println("myStack2 is: "+ mystack2);
		myStack.pop();
		int top = myStack.pop();
		int peek = myStack.peek();
		System.out.println("top element poped is: "+ top);
		System.out.println("peek element: "+ peek);
		System.out.println("myStack is: "+ myStack);
		System.out.println("Is my stack empty: "+myStack.isEmpty());
	}

}
