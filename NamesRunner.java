package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class NamesRunner {
	
	public static void main(String[] args) {
		
		Collection<String> names=new ArrayList<String>();
		names.add("Vani");
		names.add("Priyanka");
		names.add("Ramya");
		names.add("Vanita");
		
		System.out.println("check the contains");
		Stream<String> filterOutPut=names.stream().filter(value->value.contains("i"));
		filterOutPut.forEach(s->System.out.println(s));
		
		System.out.println("check equals");
		names.stream().filter(value->value.equals("Vani")).forEach(s->System.out.println(s));
		
		System.out.println("skip");
		names.stream().skip(1).forEach(s->System.out.println(s));
		
		System.out.println("limit method");
		names.stream().limit(4).forEach(s->System.out.println(s));
		
		System.out.println("sorted method");
		names.stream().sorted().forEach(s->System.out.println(s));
		
		System.out.println("unorderd");
		names.stream().unordered().forEach(s->System.out.println(s));
		
		System.out.println("distinct");
		names.stream().distinct().forEach(s->System.out.println(s));//return the unique values
		
		
		System.out.println("return the streams");
		names.stream()
		.filter(value->value.contains("a"))
		.sorted()
		.skip(1)
		.limit(4)
		.distinct()
		.forEach(s->System.out.println(s));
		
		
	}

}
