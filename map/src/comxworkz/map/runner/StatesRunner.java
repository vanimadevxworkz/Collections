package comxworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class StatesRunner {
	
	public static void main(String[] args) {
		 Map<Integer,String> map=new HashMap<Integer,String>();
			
			map.put(1, "Karnataka");
			map.put(2, "Kerala");
			map.put(3, "Goa");
			map.put(4, "Rajastna");
			map.put(5, "Tamilnadu");
			map.put(6, "Andrprdesh");
			map.put(7, "Gujarat");
			map.put(8, "Manipura");
			map.put(9, "UttarPradesh");
			map.put(10, "Telangana");
			
			System.out.println("list of map:"+map);
			
			System.out.println("check the contains:"+map.containsKey(8));
			System.out.println("value is present:"+map.containsValue("Gujarat"));
			System.out.println("check the equals:"+map.equals(map));
			System.out.println("get value:"+map.get(3));
			System.out.println("total size:"+map.size());
			System.out.println("put if absent:"+map.putIfAbsent(1, "Karnataka"));
			System.out.println("key set:"+map.keySet());
			map.remove(7);
			System.out.println(map);
			map.clear();
			System.out.println("clear the map:"+map);
		}
	}


