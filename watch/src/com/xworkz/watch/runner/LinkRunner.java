package com.xworkz.watch.runner;

import java.util.Comparator;
import java.util.LinkedList;

import com.xworkz.watch.dto.WatchDto;

public class LinkRunner {
	
	public static void main(String[] args) {
		WatchDto dto=new WatchDto("rolex", "oIconic", 10000, true, 7, 's');
		System.out.println("dto list:"+dto.toString());
		
		WatchDto dto1=new WatchDto("Omega", "precise", 50000, true, 8, 'l');
		System.out.println("dto list:"+dto1.toString());
		
		WatchDto dto2=new WatchDto("tag Heuer", "Sporty", 3000, true, 5, 's');
		System.out.println("dto list:"+dto2.toString());
		
		WatchDto dto3=new WatchDto("Citizen", "TechnicalPrecision", 4000, true, 10, 'm');
		System.out.println("dto list:"+dto3.toString());
		
		WatchDto dto4=new WatchDto("PatekPhilippe", "Coveted", 2000, true, 12, 'l');
		System.out.println("dto list:"+dto4.toString());
		
		WatchDto dto5=new WatchDto("rolex2", "omege2", 9000, true, 3, 's');
		System.out.println("dto list:"+dto5.toString());
		
		WatchDto dto6=new WatchDto("Apple", "aple", 5000, false, 5, 's');
		System.out.println("dto list:"+dto6.toString());
		
		WatchDto dto7=new WatchDto("jaeger", "LeCoultre", 15000, true, 15, 'x');
		System.out.println("dto list:"+dto7.toString());
		
		WatchDto dto8=new WatchDto("Panerai", "Shinola", 7000, true, 20, 'l');
		System.out.println("dto list:"+dto8.toString());
		
		WatchDto dto9=new WatchDto("SamSung", "Apple", 25000, true, 7, 'm');
		System.out.println("dto list:"+dto9.toString());
		
		LinkedList<WatchDto> watchName=new LinkedList<WatchDto>();
		watchName.add(dto);
		watchName.add(dto1);
		System.out.println("list of watch:"+watchName);
		watchName.add(1, dto7);
		watchName.add(3, dto4);
		System.out.println("list the watch name with index:"+watchName);
		watchName.addFirst(dto1);
		watchName.addFirst(dto);
		System.out.println("add the fisrt:"+watchName);
		watchName.addLast(dto5);
		System.out.println("lsat name:"+watchName);
		System.out.println("check the contains:"+watchName.contains(dto));
		System.out.println("get value:"+watchName.get(2));
		System.out.println("get the first value:"+watchName.getFirst());
		System.out.println("get last:"+watchName.getLast());
		System.out.println("heck index of:"+watchName.indexOf(dto8));
		System.out.println("last index of:"+watchName.lastIndexOf(dto9));
		System.out.println("offer:"+watchName.offer(dto3));

		
		//sort by name
		watchName.sort(Comparator.comparing(WatchDto::getName));
		System.out.println("sorting then name:"+watchName);
			
		watchName.sort(Comparator.comparing(WatchDto::getPrice));
		System.out.println("sorting then price:"+watchName);
		
		System.out.println(watchName.remove(dto));
		
		
		watchName.clear();
		System.out.println("clear the movi list:"+watchName);
		
		
		
	}
}
