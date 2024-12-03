package stackIntersectionUnion;
import java.util.*;
public class StackIntersectionUnion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> Stack1InterStack2 = new Stack();
		Stack<Integer> Stack1UnionStack2 = new Stack();
		int[] arr1 = {2,4,3,12,22,5};
		Stack<Integer> stackOne = new Stack();
		for(int i:arr1) {
			stackOne.push(i);
		}
		int[] arr2 = {6,7,3,5,4,12};
		Stack<Integer> stackTwo = new Stack();
		for(int i:arr2) {
			stackTwo.push(i);
		}
		Stack1InterStack2 = intersect(stackOne,stackTwo);
		displayintersect(Stack1InterStack2);
		Stack1UnionStack2 = union(stackOne,stackTwo);
		displayunion(Stack1UnionStack2);
	}
	public static Stack<Integer> intersect(Stack<Integer> stackOne,Stack<Integer> stackTwo) {
		Stack<Integer> intersect = new Stack<>();
		for(Integer i: stackOne) {
			if(stackTwo.contains(i)) {
				intersect.add(i);
			}
		}
		return intersect;
	}
	public static Stack<Integer> union(Stack<Integer> stackOne,Stack<Integer> stackTwo) {
		Stack<Integer> union = new Stack<>();
		for(Integer i: stackOne) {
			union.add(i);
		}
		for (Integer i : stackTwo) {
	        if (!stackOne.contains(i)) {
	            union.add(i);
	        }
	    }
		return union;
	}
	public static void displayintersect(Stack Stack1InterStack2) {
		System.out.println(Stack1InterStack2);
	}
	public static void displayunion(Stack Stack1UnionStack2) {
		System.out.println(Stack1UnionStack2);
	}

}
