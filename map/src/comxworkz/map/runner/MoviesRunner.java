package comxworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class MoviesRunner {
	
	public static void main(String[] args) {
		
     Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "Katera");
		map.put(2, "Kranti");
		map.put(3, "SSe");
		map.put(4, "RRR");
		map.put(5, "Bulbul");
		map.put(6, "Mejestic");
		map.put(7, "Yajamana");
		map.put(8, "manikya");
		map.put(9, "adduri");
		map.put(10, "kirataka");
		
		System.out.println("list of map:"+map);
		
		System.out.println("check the contains:"+map.containsKey(5));
		System.out.println("value is present:"+map.containsValue("manikya"));
		System.out.println("check the equals:"+map.equals(map));
		System.out.println("get value:"+map.get(6));
		System.out.println("total size:"+map.size());
		System.out.println("put if absent:"+map.putIfAbsent(3, "SSe"));
		System.out.println("key set:"+map.keySet());
		map.remove(4);
		System.out.println(map);
		map.clear();
		System.out.println("clear the map:"+map);
	}
	
	}


