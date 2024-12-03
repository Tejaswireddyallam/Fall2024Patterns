package arrarys;
import java.util.*;

public class ArrayDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[5];
		ArrayList<String> progLang = new ArrayList<>();
		
		System.out.println("Size of the numbers array: "+numbers.length);
		System.out.println("Size of the progLang arraylist: "+ progLang.size());
		
		progLang.add("Java"); progLang.add("Python"); progLang.add("Swift"); progLang.add("C++");
		
		// Get arraylist items using regular for loop
		for(int i=0; i<progLang.size();i++) {
			System.out.println(progLang.get(i));
		}
		// Get arraylist items using for-each loop
		System.out.println("using for-each loop");
		for(String lang: progLang) {
			System.out.println(lang);
		}
		progLang.remove(2); // remove element at index 2
		System.out.println("size of arraylist after removing an item: "+progLang.size());
		for(String lang: progLang) {
			System.out.println(lang);
		}
		
		progLang.add("Ruby"); progLang.add("C");
		
		
//		for(int i=0; i<progLang.size();i++) {
//			progLang.remove(i);
//			progLang.add("Rust"); progLang.add("C#");	
//		}
		System.out.println("After adding ruby and c");
		for(String lang: progLang) {
			System.out.println(lang);
		}
		
		progLang.set(0, "Patterns");
		System.out.println("After set at index 0 with patterns");
		for(String lang: progLang) {
			System.out.println(lang);
		}
		
		progLang.add(2, "SpringBoot");
		
		for(String lang: progLang) {
			System.out.println(lang);
		}
		
		boolean isempty = isEmpty(progLang);
		
		System.out.println("progLang arraylist is empty: "+ isempty);

	}
	public static boolean isEmpty(ArrayList<String> lang) {
		if(lang.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
