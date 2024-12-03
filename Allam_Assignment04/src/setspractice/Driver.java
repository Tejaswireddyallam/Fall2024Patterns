package setspractice;

//@author Tejaswi Allam

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            SetOperations setObject = new SetOperations();
            Scanner sc = new Scanner(System.in);
            int userinput;
            System.out.println("Menu:\n1- Add an element\n2- Remove an element\n3- Stop");
            System.out.print("Enter your choice: ");
            userinput = sc.nextInt();
            while(userinput != 3)
            {
            	switch (userinput) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    Object addelement = sc.next();
                    if (setObject.addToSet(addelement)) {
                        System.out.println("Element added successfully.");
                        System.out.println(setObject);
                    } else {
                        System.out.println("Element already exists in the set.");
                    }
                    
                    break;

                case 2:
                    System.out.print("Enter the element to remove: ");
                    Object removeelement = sc.next();
                    if (setObject.removeFromSet(removeelement)) {
                        System.out.println("Element removed successfully.");
                        System.out.println(setObject);
                    } else {
                        System.out.println("Element not found in the set.");
                    }
                   
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            	}
            	
                    System.out.println("\nMenu:\n1- Add an element\n2- Remove an element\n3- Stop");
                    System.out.print("Enter your choice: ");
                    userinput = sc.nextInt();       
                    
            
           }
            
            System.out.print("Exiting program..."); 
             sc.close();
}
}
