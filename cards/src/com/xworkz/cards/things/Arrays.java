package com.xworkz.cards.things;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arrays {
	
	public static void main(String[] args) {
		
		ArrayList<String> arraylist=new ArrayList<String>();
		arraylist.add("kabbadi");
		arraylist.add("kho kho");
		arraylist.add("cricket");
		arraylist.add("higu jump");
		arraylist.add("chess");
		System.out.println(arraylist);
		
		arraylist.add(5,"long jump");
		System.out.println(arraylist);
		
		arraylist.addAll(arraylist);
		System.out.println(arraylist);
		
		arraylist.addAll(3, arraylist);
		System.out.println(arraylist);
		
		System.out.println(arraylist.clone());
		
		System.out.println(arraylist.contains("kabbadi"));
		
		System.out.println(arraylist.containsAll(arraylist));
		
		System.out.println(arraylist.equals(arraylist));
		
		System.out.println(arraylist.get(4));
		
		System.out.println(arraylist.hashCode());
		
		System.out.println(arraylist.indexOf("chess"));
		
		System.out.println(arraylist.isEmpty());
		
		System.out.println(arraylist.lastIndexOf("chess"));
		
		System.out.println(arraylist.remove(2));
		
		System.out.println(arraylist.remove("long jump"));
		
		System.out.println(arraylist.set(4,"running"));
		System.out.println(arraylist);
		
		System.out.println(arraylist.size());
		
		System.out.println(arraylist.iterator());
		
		System.out.println(arraylist.spliterator());
		
		System.out.println(arraylist.listIterator());
		
		System.out.println(arraylist.listIterator(1));
		
		System.out.println(arraylist.subList(0, 3));
		
		System.out.println(arraylist.toArray());
		
		//System.out.println(arraylist.sort(null));
		
		arraylist.forEach((s)->System.out.println(s));
		
	System.out.println(arraylist.removeAll(arraylist));
	
	//System.out.println(arraylist.removeIf(null));
	//System.out.println(arraylist.toArray(null));
	
	arraylist.ensureCapacity(10);
	
	
	//System.out.println(arraylist.replaceAll(null));
	
	arraylist.trimToSize();
	
	//arraylist.clear();
	//System.out.println(arraylist);
	
	Iterator<String> iterator=arraylist.iterator();
	
	//using iterator methods
	iterator.forEachRemaining(s->System.out.println(s));
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
		
		iterator.remove();
		System.out.println(iterator);
	}
	
	//using list iterator
	
	ListIterator listIterator=arraylist.listIterator();
	while(listIterator.hasNext()) {
		//System.out.println(" previous index number:"+listIterator.previousIndex());//-1
		
		//nextIndex()
		System.out.println("index number:"+listIterator.nextIndex());
		
		//next()
		System.out.println("next element:"+listIterator.next());
		
		//previousIndex()
		System.out.println(" previous index number:"+listIterator.previousIndex());//0
	}
		
//		//set method
//		listIterator.set(arraylist);
//		System.out.println("set the dto:"+arraylist);
//		
//		//remove method
//		listIterator.remove();
//		System.out.println("remove the  method");
		
	
//if(listIterator.hasPrevious()) {
//		System.out.println("next element:"+listIterator.previous());
//		
//	}
		
		
	}

}
