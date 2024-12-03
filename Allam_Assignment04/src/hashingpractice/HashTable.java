package hashingpractice;

//@author Tejaswi Allam

public class HashTable {

	private int[] hashArray;
	
	 public HashTable(int size) {
	        hashArray = new int[size];
	        for (int i = 0; i < size; i++) {
	            hashArray[i] = -1;  // Initialize all slots as empty (-1)
	        }
	    }
	 
	  private int getHashIndex(int key) {
	        return key % hashArray.length;
	    }
	  
	  public void add(int element) {
	        int ind = getHashIndex(element);

	        // Linear probing to find an empty slot
	        while (hashArray[ind] != -1) {
	        	ind = (ind + 1) % hashArray.length;
	        }
	        hashArray[ind] = element;
	    }
	  
	    public int search(int element) {
	        int index = getHashIndex(element);
	        int originalIndex = index;

	        // Linear probing to search for the element
	        while (hashArray[index] != -1) {
	            if (hashArray[index] == element) {
	                return index;  // Element found
	            }
	            index = (index + 1) % hashArray.length;

	            // If we return to the original index, element is not present
	            if (index == originalIndex) {
	                break;
	            }
	        }
	        return -1;  // Element not found
	    }

	    public void print() {
	        System.out.print("Elements in the Hash Table: ");
	        System.out.print("[");
	        for (int i = 0; i < hashArray.length; i++) {
	            if (i > 0) System.out.print(", ");
	            System.out.print(hashArray[i] != -1 ? hashArray[i] : " ");
	        }
	        System.out.println("]");
	    }
	    
}
