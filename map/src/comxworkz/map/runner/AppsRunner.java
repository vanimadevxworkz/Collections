package comxworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class AppsRunner {
	
	public static void main(String[] args) {
		 Map<Integer,String> maps=new HashMap<Integer,String>();
			
			maps.put(1, "PlayStore");
			maps.put(2, "Google");
			maps.put(3, "Instagram");
			maps.put(4, "FaceBook");
			maps.put(5, "Whatsapp");
			maps.put(6, "Twiter");
			maps.put(7, "Snapchat");
			maps.put(8, "Drive");
			maps.put(9, "Gpay");
			maps.put(10, "PhonePay");
			System.out.println("list of map:"+maps);
			
			System.out.println("check the contains:"+maps.containsKey(8));
			
			System.out.println("value is present:"+maps.containsValue("Drive"));
			
			System.out.println("check the equals:"+maps.equals(maps));
			
			System.out.println("get value:"+maps.get(10));
			
			System.out.println("total size:"+maps.size());
			
			System.out.println("put if absent:"+maps.putIfAbsent(4, "FaceBook"));
			
			System.out.println("key set:"+maps.keySet());
			
			maps.remove(3);
			System.out.println(maps);
			
			maps.clear();
			System.out.println("clear the map:"+maps);
		}
	}

