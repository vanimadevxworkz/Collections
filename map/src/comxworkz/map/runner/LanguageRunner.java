package comxworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class LanguageRunner {
	
	public static void main(String[] args) {
		 Map<Integer,String> map=new HashMap<Integer,String>();
			
			map.put(1, "Hindi");
			map.put(2, "Kannada");
			map.put(3, "English");
			map.put(4, "Marati");
			map.put(5, "Urdu");
			map.put(6, "Tulu");
			map.put(7, "Telgu");
			map.put(8, "Malayalm");
			map.put(9, "Konkani");
			map.put(10, "koriyan");
			
			System.out.println("list of map:"+map);
			
			System.out.println("check the contains:"+map.containsKey(3));
			System.out.println("value is present:"+map.containsValue("koriyan"));
			System.out.println("check the equals:"+map.equals(map));
			System.out.println("get value:"+map.get(1));
			System.out.println("total size:"+map.size());
			System.out.println("put if absent:"+map.putIfAbsent(5, "Urdu"));
			System.out.println("key set:"+map.keySet());
			map.remove(1);
			System.out.println(map);
			map.clear();
			System.out.println("clear the map:"+map);
		}
	}


