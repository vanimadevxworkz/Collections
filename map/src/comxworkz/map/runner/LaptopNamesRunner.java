package comxworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class LaptopNamesRunner {
	
	public static void main(String[] args) {
		 Map<Integer,String> map=new HashMap<Integer,String>();
			
			map.put(1, "Dell");
			map.put(2, "Hp");
			map.put(3, "Microsoft");
			map.put(4, "Asus");
			map.put(5, "Lenova");
			map.put(6, "Aple");
			map.put(7, "Msi");
			map.put(8, "Microsoft Suface");
			map.put(9, "Samsung");
			map.put(10, "Vivobook");
			System.out.println("list of map:"+map);
			
			System.out.println("check the contains:"+map.containsKey(4));
			System.out.println("value is present:"+map.containsValue("Dell"));
			System.out.println("check the equals:"+map.equals(map));
			System.out.println("get value:"+map.get(9));
			System.out.println("total size:"+map.size());
			System.out.println("put if absent:"+map.putIfAbsent(2, "Hp"));
			System.out.println("key set:"+map.keySet());
			map.remove(3);
			System.out.println(map);
			map.clear();
			System.out.println("clear the map:"+map);
		}
	}


