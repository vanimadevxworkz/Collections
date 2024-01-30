package com.xworkz.cards.things;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class Collections {

	
	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<String>();
		collection.add("Dress collection");
		collection.add("mobile collection");
		collection.add("shoes collection");
		collection.add("jeens collection");
		System.out.println(collection);
		
		//check the contains
				System.out.println("contains:"+collection.contains("Sql"));
				//equals
				System.out.println("check the equals:"+collection.equals(collection));
				//size()
				System.out.println("size of collection:"+collection.size());
				//forEach ()
				collection.forEach(s->System.out.println(s));
				//remove
				collection.remove("CSS");
				System.out.println("remove the collections:"+collection);
				
				System.out.println("hash code:"+collection.hashCode()); 
				
				
				System.out.println("check the is empty:"+collection.isEmpty());
				
				
				System.out.println("chek the iterator:"+collection.iterator());
				
				System.out.println("check the parallel stream:"+collection.parallelStream());
				
				
				System.out.println("spilterator:"+collection.spliterator());
				
				System.out.println("stream:"+collection.stream());
				
				System.out.println("to array:"+collection.toArray());
				
				//System.out.println(collection.toArray(null));
				
				//System.out.println(collection.toArray(null));
				
				System.out.println("retain all:"+collection.retainAll(collection));
				
				System.out.println("remove all:"+collection.removeAll(collection));
				
				//System.out.println("remove if:"+collection.removeIf(collection));
					
				collection.clear();
				System.out.println("clear the collection:"+collection);
			}
	
	
	
	
		
	
}
