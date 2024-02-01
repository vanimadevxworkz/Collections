package com.xworkz.watch.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public class WatchRunner {
	
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
		
		ArrayList<WatchDto> arraylist=new ArrayList<WatchDto>();
		
		arraylist.add(dto);
		arraylist.add(dto1);
		arraylist.add(dto2);
		arraylist.add(dto3);
		arraylist.add(dto4);
		arraylist.add(dto6);
		System.out.println(arraylist);
		

		arraylist.add(5,dto);
		System.out.println(arraylist);
		System.out.println(arraylist.clone());
		System.out.println(arraylist.contains(dto1));
		System.out.println("equals:"+arraylist.equals(arraylist));
		System.out.println(arraylist.get(4));
		System.out.println(arraylist.hashCode());
		System.out.println(arraylist.indexOf(dto2));
		System.out.println(arraylist.isEmpty());
		System.out.println(arraylist.lastIndexOf(dto3));
		System.out.println(arraylist.set(4,dto));
		System.out.println(arraylist);
		System.out.println(arraylist.size());
		System.out.println(arraylist.iterator());
		System.out.println(arraylist.spliterator());
		System.out.println(arraylist.listIterator());
		System.out.println(arraylist.listIterator(1));
		System.out.println(arraylist.subList(0, 3));
		System.out.println(arraylist.toArray());
	
	//sort by name
	arraylist.sort(Comparator.comparing(WatchDto::getCompanyName));
	System.out.println("sorting by name:"+arraylist);
	
	arraylist.sort(Comparator.comparing(WatchDto::getPrice));
	System.out.println("sorting by price:"+arraylist);

	arraylist.clear();
	System.out.println( arraylist);
                        
	}

}
