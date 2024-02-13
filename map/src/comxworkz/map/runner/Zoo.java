package comxworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
	
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Amirthi");
		map.put(2, "Bannerugtta");
		map.put(3, "Chennai snack park");
		map.put(4, "chamaraj");
		map.put(5, "Gopalpura");
		map.put(6, "Gorewada");
		map.put(7, "deer park");
		map.put(8, "jaipur zoo");
		map.put(9, "indore zoo");
		map.put(10, "kamala neharu");
		
		System.out.println("list of map:"+map);
		
		System.out.println("check the contains:"+map.containsKey(3));
		System.out.println("value is present:"+map.containsValue("jaipur zoo"));
		System.out.println("check the equals:"+map.equals(map));
		System.out.println("get value:"+map.get(5));
		System.out.println("total size:"+map.size());
		System.out.println("put if absent:"+map.putIfAbsent(2, "Bannerugatta"));
		System.out.println("key set:"+map.keySet());
		map.remove(2);
		System.out.println(map);
		map.clear();
		System.out.println("clear the map:"+map);
	}
	

}
