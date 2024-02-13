package comxworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class NamesRunner {
	
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "Vanishri");
		map.put(2, "Priyanka");
		map.put(3, "Bhavya");
		map.put(4, "Hita");
		map.put(5, "Ashu");
		map.put(6, "uma");
		map.put(7, "seema");
		map.put(8, "Bhagya");
		map.put(9, "Monika");
		map.put(10, "sulochana");
		
		System.out.println("list of map:"+map);
		
		System.out.println("check the contains:"+map.containsKey(6));
		System.out.println("value is present:"+map.containsValue("Vanishri"));
		System.out.println("check the equals:"+map.equals(map));
		System.out.println("get value:"+map.get(8));
		System.out.println("total size:"+map.size());
		System.out.println("put if absent:"+map.putIfAbsent(7, "seema"));
		System.out.println("key set:"+map.keySet());
		map.remove(8);
		System.out.println(map);
		map.clear();
		System.out.println("clear the map:"+map);
	}
	

	}


