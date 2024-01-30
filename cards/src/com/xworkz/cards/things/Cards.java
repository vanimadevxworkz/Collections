package com.xworkz.cards.things;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Cards {
	public static void main(String[] args) {
		Iterable<String> card=new ArrayList<>();
		
		List<String> list=new ArrayList<String>();
		list.add("atm cards");
		list.add("debit cards");
		list.add("credit cards");
		list.add("pan cards");
		list.add("adhar cards");
		System.out.println(list);
		
		card.forEach(s->System.out.println(s));
		System.out.println(card);
		
		System.out.println(card.iterator());
		
		System.out.println(card.spliterator());
		
		Iterator<String> iterator=card.iterator();
		
		//using iterator methods
		iterator.forEachRemaining(s->System.out.println(s));
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			iterator.remove();
			System.out.println(iterator);
		}
		
		//using list iterator
		
		ListIterator listIterator=list.listIterator();
		while(listIterator.hasNext()) {
			//System.out.println(" previous index number:"+listIterator.previousIndex());//-1
			
			//nextIndex()
			System.out.println("index number:"+listIterator.nextIndex());
			
			//next()
			System.out.println("next element:"+listIterator.next());
			
			//previousIndex()
			System.out.println(" previous index number:"+listIterator.previousIndex());//0
		}
			
			//set method
			listIterator.set(list);
			System.out.println("set the dto:"+list);
			
			//remove method
			listIterator.remove();
			System.out.println("remove the  method");
			
		
//	if(listIterator.hasPrevious()) {
//			System.out.println("next element:"+listIterator.previous());
//			
//		}
		
		
		
	}

}
