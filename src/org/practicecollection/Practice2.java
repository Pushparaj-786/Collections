package org.practicecollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Practice2 {
public static void main(String[] args) {
	Set<String> s=new TreeSet<>();
	s.add("java");
	s.add("greens");
	s.add("Framework");
	s.add("selenium");
	s.add("technology");
	System.out.println(s);
	
	int size = s.size();
	System.out.println(size);
	
	s.remove("java");
	System.out.println(s);
	
	boolean contains = s.contains("greens");
	System.out.println(contains);
	
	List<String> li=new ArrayList<String>();
	System.out.println(li);
	
	li.addAll(s);
	System.out.println(li);
	li.add("Output");
	System.out.println(li);
	
	//li.retainAll(s);
	//System.out.println(li);
	
	li.removeAll(s);
	System.out.println(li);
	
	for (String x : s) {
		System.out.println(x);
		
	}
	
	
	
	
	
	
}
}
