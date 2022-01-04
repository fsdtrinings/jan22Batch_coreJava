package p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Map stores the data in Key and Value 
public class MapDemo {
	
	public static void main(String[] args) {
		
		    // key    value
		/*Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Java");
		map.put(2, "Angular");
		map.put(3, "React");
		map.put(1, "Python");
		map.put(4, "Docker");
		
		System.out.println(map);
		*/
		
		
		Map<Integer,Laptop> map = new HashMap<>();
		
		map.put(1, new Laptop(1,"HP", 1500, 5));
		map.put(2, new Laptop(2,"Dell", 1500, 5));
		map.put(3, new Laptop(3,"Lenovo", 1500, 5));
		map.put(4, new Laptop(4,"Apple", 1500, 5));
		
		
		for(Entry<Integer, Laptop> entry: map.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		System.out.println(map.get(2));
		
		
	}

}
