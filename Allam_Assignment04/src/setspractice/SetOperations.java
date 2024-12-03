package setspractice;

//@author Tejaswi Allam

import java.util.ArrayList;

public class SetOperations {
	
	 private int size;
	 private ArrayList<Object> list;
	 
	// Default constructor for initialization
	    public SetOperations() {
	        list = new ArrayList<>();
	       // size = 0;
	        this.size = list.size();
	    }

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}
	    
		 // Method to add an element to the set
	    public boolean addToSet(Object element) {
	        if (!list.contains(element)) {
	            list.add(element);
	            size = list.size();
	            return true;
	        }
	        return false;
	    }

	    // Method to remove an element from the set
	    public boolean removeFromSet(Object element) {
	        if (list.contains(element)) {
	            list.remove(element);
	            size = list.size();
	            return true;
	        }
	        return false;
	    }

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Set: Size: " + size + ", Elements: " + list;
		}
	    
	    

}
