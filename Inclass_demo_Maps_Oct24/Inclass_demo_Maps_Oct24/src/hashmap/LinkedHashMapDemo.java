package hashmap;
import java.util.*;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> nameID = new LinkedHashMap<>();
		nameID.put("Z", 642);nameID.put("B", 542);nameID.put("A", 342);
		System.out.println("nameID map:  "+ nameID);
		
//		for(Map.Entry<String, Integer> names: nameID.entrySet())
	}

}
