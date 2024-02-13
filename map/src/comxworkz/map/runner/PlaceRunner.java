package comxworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class PlaceRunner {
	
	public static void main(String[] args) {
Map<Integer,String> map1=new HashMap<Integer,String>();
		
		map1.put(1, "Benglore");
		map1.put(2, "manglore");
		map1.put(3, "Udupi");
		map1.put(4, "Bhatkal");
		map1.put(5, "Honnavara");
		map1.put(6, "Karawar");
		map1.put(7, "ankola");
		map1.put(8, "kumata");
		map1.put(9, "sirsi");
		map1.put(10, "Murdeswra");
		
		System.out.println("list of map:"+map1);
		
		System.out.println("check the contains:"+map1.containsKey(1));
		System.out.println("value is present:"+map1.containsValue("Udupi"));
		System.out.println("check the equals:"+map1.equals(map1));
		System.out.println("get value:"+map1.get(10));
		System.out.println("total size:"+map1.size());
		System.out.println("put if absent:"+map1.putIfAbsent(7, "ankola"));
		System.out.println("key set:"+map1.keySet());
		map1.remove(8);
		System.out.println(map1);
		map1.clear();
		System.out.println("clear the map:"+map1);
	}
	}


