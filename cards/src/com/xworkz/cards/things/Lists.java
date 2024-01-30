package com.xworkz.cards.things;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lists {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("hindi");
		list.add("kannada");
		list.add("english");
		list.add("tulu");
		list.add("telgu");
		System.out.println("lists are:"+list);
		
		list.add(5, "malaylm");
		System.out.println(list);
		
		list.addAll(list);
		System.out.println(list);
		
		list.addAll(6, list);
		System.out.println("add all:"+list);
		
		
		System.out.println(list.contains("hindi"));
		
		System.out.println(list.equals(list));
		
		
		System.out.println(list.get(4));
		
		
		System.out.println(list.hashCode());
		
		System.out.println(list.indexOf("hindi"));
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.lastIndexOf("telgu"));
		
		System.out.println(list.retainAll(list));
		
		System.out.println(list.set(2, "urdu"));
		System.out.println(list);
		
		System.out.println(list.size());
		
		System.out.println(list.iterator());
		
		System.out.println(list.listIterator());
		
		System.out.println(list.spliterator());
		
		System.out.println(list.subList(2, 5));
		
		System.out.println(list.toArray());
		
		System.out.println(list.toArray());
		
		//System.out.println(list.replaceAll(null));
		
		//System.out.println(list.sort(null));
		
		System.out.println(list.remove(2));
		System.out.println(list);
		
		System.out.println(list.remove("hindi"));
		System.out.println(list);
		
		
		//System.out.println(list.removeIf(null));
		//System.out.println(list);
		
		System.out.println(list.removeAll(list));
		System.out.println(list);
		

		Iterator<String> iterator=list.iterator();
		
		//using iterator methods
		iterator.forEachRemaining(s->System.out.println(s));
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			iterator.remove();
			System.out.println(iterator);
		}
		
		//using list iterator
		
		ListIterator listIterator=list.listIterator();
		//set method
		//listIterator.set(list);
		//System.out.println("set the dto:"+list);
		
		
		while(listIterator.hasNext()) {
			//System.out.println(" previous index number:"+listIterator.previousIndex());//-1
			
			//nextIndex()
			System.out.println("index number:"+listIterator.nextIndex());
			
			//next()
			System.out.println("next element:"+listIterator.next());
			
			//previousIndex()
			System.out.println(" previous index number:"+listIterator.previousIndex());//0
		}
		//remove method
				//listIterator.remove();
				//System.out.println("remove the  method");
			


		
//	if(listIterator.hasPrevious()) {
//			System.out.println("next element:"+listIterator.previous());
//			
//		}
		
		
		
	
		
	}

}
