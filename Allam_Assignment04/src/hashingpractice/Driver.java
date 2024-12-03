package hashingpractice;

//@author Tejaswi Allam

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();       
        Scanner sc = new Scanner(System.in);

        // Accept elements from the user until -1 is entered
        System.out.println("Enter elements (enter -1 to stop):");
        System.out.print("Enter element: ");
        int element = sc.nextInt();
        while(element != -1) {
            arrayList.add(element);
            System.out.print("Enter element: ");
            element = sc.nextInt();
        }

        HashTable hashTable = new HashTable(arrayList.size());
        
        // Add each element in the ArrayList to the hash table
        for (int i = 0; i < arrayList.size(); i++) {
            int ele = arrayList.get(i);
            hashTable.add(ele);
        }
        
        // Print the hash table
        hashTable.print();
        
        // Search for elements in the hash table
        System.out.print("Enter element to search (-1 to stop): ");
        int searchelement = sc.nextInt();
        while(searchelement != -1) {
            int index = hashTable.search(searchelement); 
            if (index != -1) {
                System.out.println("Element found at index " + index);
            } else {
                System.out.println("Element not found.");
            }
            System.out.print("Enter element to search (-1 to stop): ");
            searchelement = sc.nextInt();
        }
        
        sc.close();
    }
}
