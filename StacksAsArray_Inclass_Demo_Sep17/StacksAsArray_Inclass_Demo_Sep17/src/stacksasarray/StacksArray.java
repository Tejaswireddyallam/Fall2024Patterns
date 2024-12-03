package stacksasarray;

public class StacksArray {
	int max_size;
	int top;
	String mystack[];
	
	public StacksArray(int size){
		max_size = size;
		mystack=new String[max_size];
		top = -1;
	}
	public boolean isEmpty() {
//		return top==-1;
		if(top==-1) 
			return true;
		return false;
	}
	public boolean isFull() {
//		return top==-1;
		if(top==max_size) 
			return true;
		return false;
	}
	public void push(String color) {
		top++;
		mystack[top]=color;
	}
	public void printStack() {
		for(int i=top;i>=0;i--) {
			System.out.println(mystack[i]);
		}
	}
	
	public void pop()
	{
		System.out.println("popped top element");
		mystack[top] = null;
		top--;
	}
	
	public void peek()
	{
		System.out.println("The top element is " + mystack[top]);
	}
	public void search(String color)
	{
		for(int i=top;i>=0;i--) {
			if(mystack[i].equals(color))
			System.out.println("The position of " + color + " is " + i);
		}
	}
	

}
