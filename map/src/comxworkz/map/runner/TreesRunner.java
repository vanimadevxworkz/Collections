package comxworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class TreesRunner {
	
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(11, "AppleTree");
		map.put(12, "MangoTree");
		map.put(13, "BananaTree");
		map.put(14, "peepalTree");
		map.put(15, "sandal");
		map.put(16, "Oak");
		map.put(17, "Polyatthia");
		map.put(18, "Pine");
		map.put(19, "teak");
		map.put(20, "Babul");
		
		System.out.println("list of map:"+map);
		
		System.out.println("check the contains:"+map.containsKey(12));
		
		System.out.println("total size:"+map.size());
		
		System.out.println("value is present:"+map.containsValue("Oak"));
		
		System.out.println("check the equals:"+map.equals(map));
		
		System.out.println("get value:"+map.get(15));
		
		System.out.println("put if absent:"+map.putIfAbsent(13, "BananaTree"));
		
		System.out.println("key set:"+map.keySet());
		
		map.remove(20);
		System.out.println(map);
		
		map.clear();
		System.out.println("clear the map:"+map);
	}
	

	}


