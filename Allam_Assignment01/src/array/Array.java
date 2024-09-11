package array;

//@author  Tejaswi Allam

//Used to check duplicate Values
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create 2 arrays with size 10
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int maxvalue = 100,minvalue = 10;
		int sum;
		
		Random randomgen = new Random();
		
		//use set to avoid duplicates
		 Set<Integer> valuesArr1 = new HashSet<>();
		 Set<Integer> valuesArr2 = new HashSet<>();
		 
		 //add random values to array1
		  for(int i=0; i<arr1.length; i++)
		  {
			  int randomvalue1 = randomgen.nextInt((maxvalue - minvalue)+1) + minvalue;			  
			  while (!valuesArr1.add(randomvalue1)) {
				  randomvalue1 = randomgen.nextInt((maxvalue - minvalue)+1) + minvalue;  // Regenerate random number if it's not unique
	            }
			  arr1[i] = randomvalue1;
			  
		  }
		  
		  //print array1
		  for (int num : arr1) {
	            System.out.print(num + " ");
	        }
		  
		  //add random values to array2
		  for(int i=0;i<arr2.length;i++)
		  {
			  int randomvalue2 = randomgen.nextInt((maxvalue - minvalue)+1) + minvalue;
			  if(i%2 == 0)
			  {
				  randomvalue2 = randomgen.nextInt((maxvalue / 2 - minvalue / 2) + 1) * 2 + minvalue;
	                while (!valuesArr2.add(randomvalue2)) {
	                    randomvalue2 = randomgen.nextInt((maxvalue / 2 - minvalue / 2) + 1) * 2 + minvalue; // Regenerate random even number
	                }
			  }
			  else
			  {
				  randomvalue2 = randomgen.nextInt((maxvalue / 2 - minvalue / 2) + 1) * 2 + 1 + minvalue;
	                while (!valuesArr2.add(randomvalue2)) {
	                    randomvalue2 = randomgen.nextInt((maxvalue / 2 - minvalue / 2) + 1) * 2 + 1 + minvalue; // Regenerate random odd number
	                }
			  }
			  arr2[i] = randomvalue2;
		  }
		  
		//print array2
		  System.out.println();
		  for (int num : arr2) {		  
	            System.out.print(num + " ");
	        }
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("\nEnter the sum :");
		  sum = sc.nextInt();
		  
		  findPairsWithSum(arr1, arr2, sum);
		  sc.close();

	}
	
	public static void findPairsWithSum(int[] arr1, int[] arr2, int sum)
	{
		
        boolean valuesin = false;
        int count = 1;
        
        //checking pairs in array1
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] + arr1[j] == sum) {
                    System.out.println("Pair" + count);
                    System.out.println(arr1[i] + " , " + arr1[j]);
                    valuesin = true;
                    count++;
                }
            }
        }

        // Checking pairs within arr2
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] + arr2[j] == sum) {
                    System.out.println("Pair" + count);
                    System.out.println(arr2[i] + " , " + arr2[j]);
                    valuesin = true;
                    count++;
                }
            }
        }
        
        // Checking pairs between arr1 and arr2
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] + arr2[j] == sum) {
                    System.out.println("Pair" + count);
                    System.out.println(arr1[i] + " , " + arr2[j]);
                    valuesin = true;
                    count++;
                }
            }
        }
        
        // If no pairs are found return no pairs found.
        
        if (!valuesin) {
            System.out.println("No pairs found.");
        }
	}

}
