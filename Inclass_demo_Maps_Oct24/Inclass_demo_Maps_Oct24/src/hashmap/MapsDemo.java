package hashmap;
import java.util.*;
import java.util.Map.Entry;
public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashmap
		
		Map<String,Integer> namegrade  = new HashMap<>();
		namegrade.put("Darren", 95);namegrade.put("darren", 5);namegrade.put("Sai", 100);
		System.out.println("Student Grades: "+ namegrade);
		//accessing using key
		System.out.println("sai grade is: "+namegrade.get("Sai"));
		// keyset
		System.out.println("Keys of namegrade" + namegrade.keySet());
		for(String key: namegrade.keySet()) {
			System.out.println(key);
		}
		//values
		System.out.println("Values of namegrade" + namegrade.values());
		for(Integer value: namegrade.values()) {
			System.out.println(value);
		}
		
		//printing using entry set
		for(Entry<String, Integer> entry : namegrade.entrySet())
{
	System.out.println("key" + entry.getKey() + "value" + entry.getValue());
}
		
		//using Iterator

		
		System.out.println("Values and keys of namegrade" + namegrade.entrySet());
		//contains keys??
		System.out.println("Does the namegrades contains key Sai: "+ namegrade.containsKey("Sai"));
		System.out.println("Does the namegrades contains value 95: "+ namegrade.containsValue(95));
		namegrade.remove("darren");
		System.out.println("After removing darren: "+namegrade);
		System.out.println("Size of namegrade map: "+ namegrade.size());
		
		
	}
	

}
