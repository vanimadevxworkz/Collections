package comxworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class CarRunner {
	
	public static void main(String[] args) {
		
		 Map<Integer,String> map=new HashMap<Integer,String>();
			
			map.put(1, "Alto");
			map.put(2, "S-presso");
			map.put(3, "Eeco");
			map.put(4, "Celerio");
			map.put(5, "swift");
			map.put(6, "xl6");
			map.put(7, "s-cross");
			map.put(8, "ciaz");
			map.put(9, "Wagon r");
			map.put(10, "Ertiga");
			
			System.out.println("list of map:"+map);
			
			System.out.println("check the contains:"+map.containsKey(2));
			
			System.out.println("value is present:"+map.containsValue("ciaz"));
			
			System.out.println("check the equals:"+map.equals(map));
			
			System.out.println("get value:"+map.get(1));
			
			System.out.println("total size:"+map.size());
			
			System.out.println("put if absent:"+map.putIfAbsent(7, "s-cross"));
			
			System.out.println("key set:"+map.keySet());
			
			map.remove(2);
			System.out.println(map);
			
			map.clear();
			System.out.println("clear the map:"+map);
		}
	}


