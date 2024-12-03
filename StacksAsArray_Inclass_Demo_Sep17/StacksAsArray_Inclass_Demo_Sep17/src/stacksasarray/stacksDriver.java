package stacksasarray;

public class stacksDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StacksArray mystack = new StacksArray(5);
		System.out.println("Is the stack empty: "+mystack.isEmpty());
		System.out.println("Is the stack full: "+mystack.isFull());
		mystack.push("red");mystack.push("green");mystack.push("black");
		mystack.push("yellow");mystack.push("pink");	
//		mystack.push("black");
		mystack.printStack();
		System.out.println("top is: "+mystack.top);
		mystack.pop();
		//after pop
		mystack.printStack();
		mystack.peek();
		//System.out.println("top is: "+mystack.top);
		mystack.search("green");
		
	}

}
